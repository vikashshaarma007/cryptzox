package edu.qs.application.repostiory;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.qs.application.entity.Ticker;

@Repository
public interface TickerRepository extends JpaRepository<Ticker, Long> {
	
	

	

	

}
