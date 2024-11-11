package edu.qs.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import edu.qs.application.service.TickerService;

public class DataLoader implements CommandLineRunner {
	

	    @Autowired
	    private TickerService tickerService;

	    @Override
	    public void run(String... args) throws Exception {
	        tickerService.fetchData();
	    }
	}



