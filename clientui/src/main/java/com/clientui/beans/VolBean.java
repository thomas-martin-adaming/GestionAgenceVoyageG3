package com.clientui.beans;

public class VolBean {
	private Long idVol;
	private String titre;
	private String description;
	private String image;
	private Double prix;

	public VolBean() {
	}

	public VolBean(String titre, String description, String image, Double prix) {
		this.titre = titre;
		this.description = description;
		this.image = image;
		this.prix = prix;
	}

	public VolBean(String titre, String description) {
		this.titre = titre;
		this.description = description;
	}

	public Long getIdVol() {
		return idVol;
	}

	public void setIdVol(Long idVol) {
		this.idVol = idVol;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Vol [idVol=" + idVol + ", titre=" + titre + ", description=" + description + ", image=" + image
				+ ", prix=" + prix + "]";
	}
}
