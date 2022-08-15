package com.ApplicationApiregion.Apiregion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApplicationApiregion.Apiregion.entite.region;
import com.ApplicationApiregion.Apiregion.repositories.RegionRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data @AllArgsConstructor
public class RegionServiceImpl implements RegionService {

	private final RegionRepository RegionRepository;
	
	@Override
	public region creer(region region) {
        
		return RegionRepository.save(region);
	}

	@Override
	public List<region> lire() {
		return RegionRepository.findAll();
	}

	@Override
	public region modifier(Long Id, region region) {
		// TODO Auto-generated method stub
		return RegionRepository.findById(Id)
				.map(R->{
					R.setCode_region(region.getCode_region());
					R.setNom(region.getNom());
					R.setActivite(region.getActivite());
					R.setSuperficie(region.getSuperficie());
					R.setPopulation(region.getPopulation());
					return RegionRepository.save(R);
				}).orElseThrow(()->new RuntimeException("Region non trouvée"));
	}

	@Override
	public String supprimer(Long Id) {
		// TODO Auto-generated method stub
		RegionRepository.deleteById(Id);
		return "Region supprimée";
	}

	//@Override
	//public Iterable<Object[]> getRegionSansP() {
		// TODO Auto-generated method stub
		//return RegionRepository.getRegionSansP();
	}
	


