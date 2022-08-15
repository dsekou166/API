package com.ApplicationApiregion.Apiregion.services;

import java.util.List;

import com.ApplicationApiregion.Apiregion.entite.region;

public interface RegionService {

	region creer(region region);
	
	List<region> lire();
	
	region modifier(Long Id, region region);
	
	String supprimer(Long Id);
	
	//Iterable<Object[]> getRegionSansP();
}
