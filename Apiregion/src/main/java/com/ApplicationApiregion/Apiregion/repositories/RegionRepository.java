package com.ApplicationApiregion.Apiregion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ApplicationApiregion.Apiregion.entite.Pays;
import com.ApplicationApiregion.Apiregion.entite.Population;
import com.ApplicationApiregion.Apiregion.entite.region;

public interface RegionRepository extends JpaRepository<region, Long> {

	void save(Population population);
	void save(Pays pays);
	//@Query(value="SELECT nom, code_region, activite, superfie,langue, chiffre,annee from region, population where region.population_id=population.id ")
	//Iterable<Object[]> getRegionSansP();

}
