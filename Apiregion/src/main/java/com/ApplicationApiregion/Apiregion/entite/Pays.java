package com.ApplicationApiregion.Apiregion.entite;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="pays")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Pays {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long Id ;
	private String nom;
	
}
