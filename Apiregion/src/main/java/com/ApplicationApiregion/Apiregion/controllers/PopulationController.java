package com.ApplicationApiregion.Apiregion.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApplicationApiregion.Apiregion.entite.Population;
import com.ApplicationApiregion.Apiregion.services.PopulationService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/Population")
@AllArgsConstructor

public class PopulationController {
	
    private final PopulationService PopulationService;
	
	@PostMapping("/create")

	public Population create(@RequestBody Population population) {
		return PopulationService.creer(population);
	}
	
	@GetMapping("/read")
	public List<Population> read(){
		return PopulationService.lire();
		
	}
	
	@PutMapping("/update/{Id}")
	public Population update(@PathVariable Long Id,@RequestBody Population population) {
		return PopulationService.modifier( Id, population);
	}
	
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable Long Id) {
		return PopulationService.supprimer(Id);
	}



}
