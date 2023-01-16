package com.marco.dockerTest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marco.dockerTest.model.Contatto;

@RestController
public class ServiceRestController {

	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Marco1", "Zanchetta1", "Mark1"));		
		lista.add(new Contatto("Marco2", "Zanchetta2", "Mark2"));		
		lista.add(new Contatto("Marco3", "Zanchetta3", "Mark3"));		
		
		return lista;
		
	}
	
}
