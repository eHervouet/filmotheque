package com.example.demo.bean;

import java.util.Date;

public class Personne {

	private int id;
	
	private String nom;
	
	private String prenom;
	
	private Date date_naissance;

	public Personne(int id, String nom, String prenom, Date date_naissance) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_naissance = date_naissance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_naissance == null) ? 0 : date_naissance.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personne other = (Personne) obj;
		if (date_naissance == null) {
			if (other.date_naissance != null)
				return false;
		} else if (!date_naissance.equals(other.date_naissance))
			return false;
		if (id != other.id)
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date_naissance=" + date_naissance
				+ "]";
	}
}
