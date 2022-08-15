package com.ApplicationApiregion.Apiregion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApplicationApiregion.Apiregion.entite.Population;
import com.ApplicationApiregion.Apiregion.repositories.PopulationRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor

public class PopulationServiceImpl implements PopulationService {

	private final PopulationRepository Populationrepository;
	@Override
	public Population creer(Population population) {
		// TODO Auto-generated method stub
		return Populationrepository.save(population);
	}

	@Override
	public List<Population> lire() {
		// TODO Auto-generated method stub
		return Populationrepository.findAll();
	}

	@Override
	public Population modifier(Long Id, Population Population) {
		return Populationrepository.findById(Id)
				.map(P->{
					P.setChiffre(Population.getChiffre());
					P.setAnnee(Population.getAnnee());
					P.setLangue(Population.getLangue());
					return Populationrepository.save(P);
				}).orElseThrow(()->new RuntimeException("Population non trouvée"));
	}

	@Override
	public String supprimer(Long Id) {
		Populationrepository.deleteById(Id);
		return "Population supprimée";
	}

	
	
}
