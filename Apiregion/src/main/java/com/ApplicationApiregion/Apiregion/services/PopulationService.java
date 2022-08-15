package com.ApplicationApiregion.Apiregion.services;

import java.util.List;

import com.ApplicationApiregion.Apiregion.entite.Population;

public interface PopulationService {

Population creer(Population region);
	
	List<Population> lire();
	
	Population modifier(Long Id, Population Population);
	
	String supprimer(Long Id);
}
