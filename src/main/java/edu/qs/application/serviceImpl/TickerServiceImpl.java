package edu.qs.application.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import edu.qs.application.entity.Ticker;
import edu.qs.application.repostiory.TickerRepository;
import edu.qs.application.service.TickerService;




@Service
public class TickerServiceImpl implements TickerService {
	
	@Autowired
    private TickerRepository tickerRepository;

    @Value("${api.url}")
    private String apiUrl;

    public void fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map<String, Object>> response = restTemplate.exchange(apiUrl, HttpMethod.GET, null, new ParameterizedTypeReference<Map<String, Object>>() {});
        Map<String, Object> data = response.getBody();
        List<Map<String, Object>> top10 = data.values().stream().limit(10).map(obj -> (Map<String, Object>) obj).collect(Collectors.toList());

        tickerRepository.deleteAll();
        for (Map<String, Object> item : top10) {
            Ticker ticker = new Ticker();
            ticker.setName((String) item.get("name"));
            ticker.setLast(Double.parseDouble((String) item.get("last")));
            ticker.setBuy(Double.parseDouble((String) item.get("buy")));
            ticker.setSell(Double.parseDouble((String) item.get("sell")));
            ticker.setVolume(Double.parseDouble((String) item.get("volume")));
            ticker.setBaseUnit((String) item.get("base_unit"));
            tickerRepository.save(ticker);
        }
    }

    @Override 
    public List<Ticker> getAllTickers() { 
    	return tickerRepository.findAll(); 
    	}

    public double getAvgBuy() {
        List<Ticker> tickers = tickerRepository.findAll();
        if (!tickers.isEmpty()) {
            return tickers.get(0).getBuy();  // Get the buy price of the first ticker
        }
        return 0;  // Return 0 if no tickers are found
    }
    
    

    


	
}



