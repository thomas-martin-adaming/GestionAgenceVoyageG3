package com.operatingcompagny.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operatingcompagny.repository.OperatingCompagnyRepository;
import com.operatingcompagny.entities.OperatingCompagny;

@RestController
@CrossOrigin("*")
public class OperatingCompagnyController{

	@Autowired
	private OperatingCompagnyRepository operatingCompagnyRepository;
	
	@GetMapping("/operatingCompagnys")
	public List<OperatingCompagny> findAll(){
		return operatingCompagnyRepository.findAll();
	}


	@GetMapping("/operatingCompagnys/{id}")
	public Optional<OperatingCompagny>  findById(@PathVariable Long id){
		return operatingCompagnyRepository.findById(id);
	}
	
	@PostMapping("/operatingCompagnys")
	public OperatingCompagny Enregistrer(@RequestBody OperatingCompagny c){
		return operatingCompagnyRepository.save(c);
	}
	
	@DeleteMapping("/operatingCompagnys/{id}")
	public void Supprimer(@PathVariable Long id){
		 operatingCompagnyRepository.deleteById(id);
		
	}
	
	@PutMapping("/operatingCompagnys/{id}")
	public OperatingCompagny Enregistrer(@PathVariable Long id,@RequestBody OperatingCompagny c){
		c.setOperatingCompagnyId(id);
		return operatingCompagnyRepository.save(c);
	}
	
}


