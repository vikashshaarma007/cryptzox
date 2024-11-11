package edu.qs.application.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import edu.qs.application.entity.Ticker;


public interface TickerService {

	 List<Ticker> getAllTickers(); 
	 double getAvgBuy();
	 
	
	void fetchData();
	
   

	
	
	

}
