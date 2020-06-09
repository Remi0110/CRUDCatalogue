package org.sid.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Produit implements Serializable {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min=5, max=100, message="Taille comprise entre 5 et 100 caractères")
	private String designation;
	@NotNull(message = "Veuillez entrer un prix")
	@DecimalMin("100.00")
	private BigDecimal prix;
	@NotNull(message = "Veuillez entrer la quantité")
	private int quantite;
	
	public Produit() {
		super();
	}


	public Produit(String designation, BigDecimal prix, int quantite) {
		super();
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public BigDecimal getPrix() {
		return prix;
	}


	public void setPrix(BigDecimal prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
}
