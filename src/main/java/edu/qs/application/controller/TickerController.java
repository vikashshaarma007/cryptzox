package edu.qs.application.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.qs.application.entity.Ticker;
import edu.qs.application.repostiory.TickerRepository;
import edu.qs.application.service.TickerService;


//@RequestMapping("/api")
@Controller
public class TickerController {
	

	    @Autowired
	    private TickerService tickerService;
	    
	    @Autowired
	    private TickerRepository tickerRepository;
	    
	    /*
	     
       @GetMapping("/tickers")
	   public ResponseEntity<List<Ticker>> getAllTickers() {
    try {
        List<Ticker> list = tickerRepository.findAll();
        if (list.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(list, HttpStatus.OK);
    } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}


	    @GetMapping("/fetch")
	    public ResponseEntity<String> fetchAndStoreTickers() {
	        tickerService.fetchData();
	        return ResponseEntity.ok("Data fetched and stored successfully");
	    }
 */



	        @GetMapping("/fetch")
	        public String fetchAndStoreTickers() {
	            tickerService.fetchData();
	            return "redirect:/index";
	        }
	        
	        
/*
	            @GetMapping("/tickers")
	            public String showAllTickers(Model model) {
	                List<Ticker> tickers = tickerService.getAllTickers();

	                if (tickers.isEmpty()) {
	                    model.addAttribute("message", "No tickers available.");
	                } else {
	                    model.addAttribute("tickers", tickers);
	                }

	                return "index"; // Refers to the `tickers.html` template in `src/main/resources/templates/`
	            }
	       
	        

	    	// display list of tickers
	    	@GetMapping("/")
	    	public String viewHomePage(Model model) {
	    		//return findPaginated(1, "firstName", "asc", keyword, model);
	    		model.addAttribute("listTicker", tickerService.getAllTickers());
	    		return "index";
	    		//return findPaginated(1, "firstName", "asc", model);		
	    	}*/
	        
	        @GetMapping("/")
	        public String viewHomePage(Model model,@Param("keyword") String keyword) {
	        	
	            // Get the list of tickers
	            List<Ticker> tickers = tickerService.getAllTickers();
	            
	            // Add the list of tickers to the model
	            model.addAttribute("listTicker", tickers);
	            
	            // Calculate avgBuy from the service
	            double avgBuy = tickerService.getAvgBuy();  // Fetch the avgBuy from the service
	            model.addAttribute("avgBuy", avgBuy);  // Add avgBuy to the model
	            //return findPaginated(1, model);
	            
	            return "index";
	        }
	        
	        
	        

	        
}

