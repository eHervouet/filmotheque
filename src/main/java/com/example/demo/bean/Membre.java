package com.example.demo.bean;

import java.util.Date;

public class Membre {

	private int id;
	
	private boolean isAdmin;
	
	private String nom;
	
	private String prenom;
	
	private String pseudo;
	
	private String mot_de_passe;
	
	private Date date_naissance;
	
	private Date date_inscription;

	public Membre(int id, boolean isAdmin, String nom, String prenom, String pseudo, String mot_de_passe,
			Date date_naissance, Date date_inscription) {
		this.id = id;
		this.isAdmin = isAdmin;
		this.nom = nom;
		this.prenom = prenom;
		this.pseudo = pseudo;
		this.mot_de_passe = mot_de_passe;
		this.date_naissance = date_naissance;
		this.date_inscription = date_inscription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
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

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMot_de_passe() {
		return mot_de_passe;
	}

	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}

	public Date getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(Date date_naissance) {
		this.date_naissance = date_naissance;
	}

	public Date getDate_inscription() {
		return date_inscription;
	}

	public void setDate_inscription(Date date_inscription) {
		this.date_inscription = date_inscription;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date_inscription == null) ? 0 : date_inscription.hashCode());
		result = prime * result + ((date_naissance == null) ? 0 : date_naissance.hashCode());
		result = prime * result + id;
		result = prime * result + (isAdmin ? 1231 : 1237);
		result = prime * result + ((mot_de_passe == null) ? 0 : mot_de_passe.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		result = prime * result + ((pseudo == null) ? 0 : pseudo.hashCode());
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
		Membre other = (Membre) obj;
		if (date_inscription == null) {
			if (other.date_inscription != null)
				return false;
		} else if (!date_inscription.equals(other.date_inscription))
			return false;
		if (date_naissance == null) {
			if (other.date_naissance != null)
				return false;
		} else if (!date_naissance.equals(other.date_naissance))
			return false;
		if (id != other.id)
			return false;
		if (isAdmin != other.isAdmin)
			return false;
		if (mot_de_passe == null) {
			if (other.mot_de_passe != null)
				return false;
		} else if (!mot_de_passe.equals(other.mot_de_passe))
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
		if (pseudo == null) {
			if (other.pseudo != null)
				return false;
		} else if (!pseudo.equals(other.pseudo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Membre [id=" + id + ", isAdmin=" + isAdmin + ", nom=" + nom + ", prenom=" + prenom + ", pseudo="
				+ pseudo + ", mot_de_passe=" + mot_de_passe + ", date_naissance=" + date_naissance
				+ ", date_inscription=" + date_inscription + "]";
	}
}
