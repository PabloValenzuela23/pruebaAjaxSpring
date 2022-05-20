package com.example.demo.services;

import com.example.demo.models.Sede;

public interface SedeService {
	
	public Iterable<Sede> findAll();
	
	public Sede find(int id);
}
