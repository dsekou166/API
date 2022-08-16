package com.ApplicationApiregion.Apiregion.controllers;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(value = "hello", description = "Region")
public class RegionController {
 
	
	private final RegionService RegionService;

	@ApiOperation(value = "Creer une region")
	@PostMapping("/create")
	public region create(@RequestBody region Region) {
		return RegionService.creer(Region);
	}

	@ApiOperation(value = "Lister les regions")
	@GetMapping("/read")
	public List<region> read(){
		return RegionService.lire();
		
	}

	@ApiOperation(value = "Modifier une region")
	@PutMapping("/update/{Id}")
	public region update(@PathVariable Long Id,@RequestBody region Region) {
		return RegionService.modifier( Id, Region);
	}

	@ApiOperation(value = "Supprimer une region")
	@DeleteMapping("/delete/{Id}")
	public String delete(@PathVariable Long Id) {
		return RegionService.supprimer(Id);
	}

	@ApiOperation(value = "Afficher region sans pays")
	@GetMapping("/affichageSansPays")
	public List<Object[]> getRegionSansP() {
		// TODO Auto-generated method stub
		return RegionService.getRegionSansP();
	}
	
}
	
