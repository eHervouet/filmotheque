package com.example.demo.bean;

public class Avis {
	
	private int id;
	
	private String titre;
	
	private String commentaire;

	public Avis(int id, String titre, String commentaire) {
		this.id = id;
		this.titre = titre;
		this.commentaire = commentaire;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentaire == null) ? 0 : commentaire.hashCode());
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
		Avis other = (Avis) obj;
		if (commentaire == null) {
			if (other.commentaire != null)
				return false;
		} else if (!commentaire.equals(other.commentaire))
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
		return "Avis [id=" + id + ", titre=" + titre + ", commentaire=" + commentaire + "]";
	}
}
