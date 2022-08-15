package com.ApplicationApiregion.Apiregion.entite;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="region")
@Data @NoArgsConstructor @AllArgsConstructor @ToString 
public class region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
	@Column(name="code_region")	
     private String code_region;
    private String nom;
	private String activite;
	private float superficie;
	
	@ManyToOne
	private Population population;
	@ManyToOne 
	private Pays pays;
}
