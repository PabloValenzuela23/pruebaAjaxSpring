package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.PisoEntity;
import com.example.demo.repositories.PisoRepository;

@Service("pisoService")
public class PisoServiceImpl implements PisoService{
	
	@Autowired
	private PisoRepository pisoRepository;
	
	@Override
	public List<PisoEntity>findBySede(long id){
		return pisoRepository.findBySede(id);
	}
	

	
}
