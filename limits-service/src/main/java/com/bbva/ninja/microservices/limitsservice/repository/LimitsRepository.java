package com.bbva.ninja.microservices.limitsservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bbva.ninja.microservices.limitsservice.model.Limit;


@Repository
public interface LimitsRepository extends CrudRepository<Limit,String>  {
    
	Iterable<Limit> findByAccount(String account);
	
}
