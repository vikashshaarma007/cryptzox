package edu.qs.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import edu.qs.application.entity.Ticker;
import edu.qs.application.repostiory.TickerRepository;
import edu.qs.application.service.TickerService;

@Controller
public class TickerController {

    @Autowired
    private TickerService tickerService;

    @Autowired
    private TickerRepository tickerRepository;

    
    @GetMapping({"/", "/index"})
    public String viewHomePage(Model model) {
        List<Ticker> tickers = tickerService.getAllTickers();
        model.addAttribute("listTicker", tickers);
        model.addAttribute("avgBuy", tickerService.getAvgBuy());
        return "index"; // templates/index.html
    }

    
    @GetMapping("/fetch")
    @ResponseBody
    public ResponseEntity<List<Ticker>> fetchAndReturnUpdatedTickers() {
        tickerService.fetchData();
        List<Ticker> updatedTickers = tickerRepository.findAll();
        return ResponseEntity.ok(updatedTickers);
    }


    
    @GetMapping("/api/tickers")
    public ResponseEntity<List<Ticker>> getAllTickers() {
        List<Ticker> tickers = tickerService.getAllTickers();
        return ResponseEntity.ok()
                .header(HttpHeaders.CACHE_CONTROL, "no-cache, no-store, must-revalidate")
                .body(tickers);
    }

}
