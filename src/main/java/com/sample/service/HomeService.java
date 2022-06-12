package com.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	private HomeRepository repository;
	
	public String getTime() {
		return repository.getTime();
	}

}
