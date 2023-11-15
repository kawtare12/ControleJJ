package com.elazizi.entities;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
@Entity
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
    private String photo;
	@ManyToOne
    @JoinColumn(name = "service_id")  

	private Service1 service;
	
	@ManyToOne
    @JoinColumn(name = "chef_id")  

	private Employe chef;
	

	public Employe() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Service1 getService() {
		return service;
	}

	public void setService(Service1 service) {
		this.service = service;
	}


	public Employe getChef() {
		return chef;
	}

	public void setChef(Employe chef) {
		this.chef = chef;
	}


}
