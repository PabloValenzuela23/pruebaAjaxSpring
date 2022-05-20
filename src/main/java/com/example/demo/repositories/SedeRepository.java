package com.example.demo.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Sede;

@Repository("sederepository")
public interface SedeRepository extends JpaRepository<Sede,Long>{
	
	
	
}
