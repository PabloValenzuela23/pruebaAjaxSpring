package com.example.demo.entities;

import java.io.Serializable;

public class PisoEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private int npiso;

	public PisoEntity() {
		
	}
	
	public PisoEntity(Long id,int npiso) {
		this.id = id;
		this.npiso = npiso;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNpiso() {
		return npiso;
	}

	public void setNpiso(int npiso) {
		this.npiso = npiso;
	}
	
}
