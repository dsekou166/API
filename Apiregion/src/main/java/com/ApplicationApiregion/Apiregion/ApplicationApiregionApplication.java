package com.ApplicationApiregion.Apiregion;

import com.ApplicationApiregion.Apiregion.repositories.RegionRepository;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.ApplicationApiregion.Apiregion.repositories.PopulationRepository;

import com.ApplicationApiregion.Apiregion.entite.region;
import com.ApplicationApiregion.Apiregion.entite.Pays;
import com.ApplicationApiregion.Apiregion.entite.Population;
import com.ApplicationApiregion.Apiregion.repositories.PaysRepository;

@SpringBootApplication
public class ApplicationApiregionApplication  implements CommandLineRunner {
	@Autowired
	private RegionRepository RegionRepository;
	private PopulationRepository PopulationRepository;
	private PaysRepository PaysRepository;

	public static void main(String[] args) {
		 SpringApplication.run(ApplicationApiregionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	//RegionRepository.save(new region(null, "12DK1","kayes","commerce",40000));
	//RegionRepository.save(new region(null, "12D1","segou","agriculture",30000));

     //RegionRepository.save(new Population(null, "12DK1", 200000,new Date(),"Bambara"));
     //RegionRepository.save(new Population(null, "12D1", 250000, new Date(),"Bambara"));	
	 //RegionRepository.save(new Pays(null, "Mali"));
	}
	
}
