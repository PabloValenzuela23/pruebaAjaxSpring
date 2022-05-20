package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.PisoEntity;

public interface PisoService {
	public List<PisoEntity>findBySede(long id);
}
