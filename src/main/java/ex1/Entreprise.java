package ex1;

import java.util.Date;

public class Entreprise {

	/** Siret : int  */
	private int siret;
	/** Nom : String  */
	private String nom;
	/** adresse : String  */
	private String adresse;
	/** date_Creation : Date  */
	private Date dateCreation;
	
	/** CAPITAL_MAX : représente le montant max d'un capital d'entreprise  */
	public static final int CAPITAL_MAX = 3000000;
	
	/*
	 * Affiche le statut
	 */
	public void afficherStatut(){
		//TODO implémentation a venir
	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	
}
