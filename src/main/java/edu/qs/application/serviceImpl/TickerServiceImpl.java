package edu.qs.application.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
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

    @Value("${api.key}")
    private String apiKey;

    @Value("${api.secret}")
    private String apiSecret;

    public void fetchData() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Map<String, Object>> response =
                restTemplate.exchange(apiUrl, HttpMethod.GET, null,
                        new ParameterizedTypeReference<Map<String, Object>>() {});
        Map<String, Object> data = response.getBody();
        List<Map<String, Object>> top10 = data.values().stream()
                .limit(10)
                .map(obj -> (Map<String, Object>) obj)
                .collect(Collectors.toList());

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
            return tickers.get(0).getBuy();
        }
        return 0;
    }

    // Utility for signing requests (for private APIs)
    private String generateSignature(String data, String secret) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            mac.init(secretKeySpec);
            byte[] hash = mac.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (Exception e) {
            throw new RuntimeException("Error while generating signature", e);
        }
    }
}
