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

import lombok.AllArgsConstructor;

import com.ApplicationApiregion.Apiregion.entite.region;
import com.ApplicationApiregion.Apiregion.services.RegionService;



@RestController
@RequestMapping("/region")
@AllArgsConstructor
public class RegionController {
 
	
	private final RegionService RegionService;
	
	@PostMapping("/create")
	
	public region create(@RequestBody region Region) {
		return RegionService.creer(Region);
	}
	
	@GetMapping("/read")
	public List<region> read(){
		return RegionService.lire();
		
	}
	@PutMapping("/update/{Id}")
	public region update(@PathVariable Long Id,@RequestBody region Region) {
		return RegionService.modifier( Id, Region);
	}
	
	@DeleteMapping("/delete/{Id}")

	public String delete(@PathVariable Long Id) {
		return RegionService.supprimer(Id);
	}
	
	
	//@GetMapping("/affichageSansPays")
	//public Iterable<Object[]> getRegionSansP() {
		// TODO Auto-generated method stub
		//return RegionService.getRegionSansP();
	//}
	
}
	
