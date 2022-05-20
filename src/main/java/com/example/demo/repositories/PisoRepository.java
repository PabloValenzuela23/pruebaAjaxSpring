package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.PisoEntity;
import com.example.demo.models.Piso;




@Repository("pisoRepository")
public interface PisoRepository extends JpaRepository<Piso,Long>{
	
	@Query("select new  com.example.demo.entities.PisoEntity(id,npiso) from Piso where sede.id = :id")
	public List<PisoEntity>findBySede(@Param("id")long id);
	

	
	
}
