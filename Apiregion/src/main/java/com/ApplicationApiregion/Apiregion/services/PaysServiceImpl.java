package com.ApplicationApiregion.Apiregion.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApplicationApiregion.Apiregion.entite.Pays;
import com.ApplicationApiregion.Apiregion.repositories.PaysRepository;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
@Data @AllArgsConstructor
public class PaysServiceImpl implements PaysService {
	
	private final PaysRepository PaysRepository;
	@Override
	public Pays creer(Pays pays) {
		// TODO Auto-generated method stub
		return PaysRepository.save(pays);
	}

	@Override
	public List<Pays> lire() {
		// TODO Auto-generated method stub
		return PaysRepository.findAll();
	}

	@Override
	public Pays modifier(Long Id, Pays pays) {
		// TODO Auto-generated method stub
		return PaysRepository.findById(Id)
				.map(Pa->{
                     Pa.setNom(pays.getNom());
					return PaysRepository.save(Pa);
				}).orElseThrow(()->new RuntimeException("Pays non trouvée"));
	}

	@Override
	public String supprimer(Long Id) {
		PaysRepository.deleteById(Id);
		return "Pays supprimée";
	}

}
