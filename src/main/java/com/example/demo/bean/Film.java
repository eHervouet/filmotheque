package com.example.demo.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

@Entity
public class Film {
	
	@Id
	@GeneratedValue
	private Integer id;

	private String titre;	
	
	private String annee_sortie;
	
	private int duree;
	
	private String description;
	
	
	public Film(Integer id, String titre, String annee_sortie, int duree, String description) {
		this.id = id;
		this.titre = titre;
		this.annee_sortie = annee_sortie;
		this.duree = duree;
		this.description = description;
	}
	
	public Film() {}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAnnee_sortie() {
		return annee_sortie;
	}

	public void setAnnee_sortie(String annee_sortie) {
		this.annee_sortie = annee_sortie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annee_sortie == null) ? 0 : annee_sortie.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + duree;
		result = prime * result + id;
		result = prime * result + ((titre == null) ? 0 : titre.hashCode());
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
		Film other = (Film) obj;
		if (annee_sortie == null) {
			if (other.annee_sortie != null)
				return false;
		} else if (!annee_sortie.equals(other.annee_sortie))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duree != other.duree)
			return false;
		if (id != other.id)
			return false;
		if (titre == null) {
			if (other.titre != null)
				return false;
		} else if (!titre.equals(other.titre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee_sortie=" + annee_sortie + ", duree=" + duree
				+ ", description=" + description + "]";
	}

}
