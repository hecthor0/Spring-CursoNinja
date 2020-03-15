package com.bbva.ninja.microservices.limitsservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bbva.ninja.microservices.limitsservice.model.Limit;
import com.bbva.ninja.microservices.limitsservice.repository.LimitsRepository;

@Service
public class LimitsServiceImpl implements LimitsService{
	
	@Autowired
	LimitsRepository limitsRepository;
	
	@Override
	public Iterable<Limit> getLimits(String accountId) {
		return limitsRepository.findByAccount(accountId);
	}

	@Override
	public Limit createLimit(Limit limit) {
		return limitsRepository.save(limit);
	}		
	
}




