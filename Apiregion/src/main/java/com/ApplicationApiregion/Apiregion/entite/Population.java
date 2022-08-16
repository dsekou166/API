package com.ApplicationApiregion.Apiregion.entite;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Table(name="population")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Population {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;	
    private int chiffre;
    private String annee;
	private String langue;

}
