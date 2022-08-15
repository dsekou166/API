package com.ApplicationApiregion.Apiregion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApplicationApiregion.Apiregion.entite.Population;

public interface PopulationRepository extends JpaRepository<Population,Long> {

}
