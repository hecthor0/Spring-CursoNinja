package com.bbva.ninja.microservices.limitsservice.services;

import com.bbva.ninja.microservices.limitsservice.model.Limit;

public interface LimitsService {
	
public Iterable<Limit> getLimits(String accountId);
	
	public Limit createLimit(Limit limit);


}
