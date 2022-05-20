package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Sede;
import com.example.demo.repositories.SedeRepository;



@Service("sedeService")
public class SedeServiceImpl implements SedeService {
	
	
	@Autowired
	private SedeRepository sederepository;

	@Override
	public Iterable<Sede> findAll() {
		
		return sederepository.findAll();
	}

	@Override
	public Sede find(int id) {
		return sederepository.findById((long) id).get();
	}
	
	

}
