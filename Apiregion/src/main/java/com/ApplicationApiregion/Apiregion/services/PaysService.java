package com.ApplicationApiregion.Apiregion.services;

import java.util.List;

import com.ApplicationApiregion.Apiregion.entite.Pays;

public interface PaysService {


	Pays creer(Pays pays);
	
	List<Pays> lire();
	
	Pays modifier(Long Id, Pays pays);
	
	String supprimer(Long Id);
}
