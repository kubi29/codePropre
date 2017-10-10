package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComptageStock {

	/** nb : int  */
	private int nb;
	/** resultat : int  */
	private int resultat;
	/** dateDebutComptage : Date  */
	private Date dateDebutComptage;
	/** dateFinComptage : String  */
	private String dateFinComptage;
	/** type : String  */
	private String type;
	
	
	/**
	 * permet d'ajouter un nouveaux element
	 * @param montant
	 */
	public void ajouterElement(int montant){
		
		
			nb++;
			resultat +=montant;
		
		
		
	}
	
	/**
	 *  Affiche le statut du compte
	 *  @param typeComtage SOMME ou MOYENNE
	 * @throws ParseException 
	 */
	public void afficheStatutComptage(TypesComptage typesComptage) throws ParseException{
		
		affichageResultat(typesComptage);
		
		affichageDateDebut();
		
		affichageDateFin();
	}
	
	/**
	 * affiche le resultat en fonction du type
	 */
	private void affichageResultat(TypesComptage type) {
		if (type!=null && type.equals(TypesComptage.SOMME)){
			afficherResultat(resultat , "SOMME");
		}
		else if (type!=null && type.equals(TypesComptage.MOYENNE)){
			
			afficherResultat(resultat/nb , "MOYENNE");
			
		}
	}

	/**
	 * affiche la date de début
	 * @throws ParseException 
	 */
	private void affichageDateDebut() throws ParseException {
		if (dateDebutComptage!=null){
			System.out.println(DateUtile.formatDateVerString(dateDebutComptage));
				
		}
	}
	
	/**
	 * affiche la date de fin 
	 */
	private void affichageDateFin() {
		if (dateFinComptage!=null){
			System.out.println("Le comptage est clos depuis le "+dateFinComptage);
			if (nb==0){
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			}
			else {
				System.out.println("Le comptage est clos et est OK.");
			}
		}
		else {
			System.out.println("Le compte est actif.");
		}
	}


	/**
	 * Affiche le resultat du calcul
	 * @param resultat
	 * @param type
	 */
	private void afficherResultat(double resultat , String type) {
		System.out.println("Ce comptage est de type " + type);
		System.out.println("Nombre d'élements "+nb);
		
		System.out.println("Résultat "+resultat);
	}
	
	
	/**
	 * transforme la date
	 * @return
	 */
	public Date getDateFinComptage(){
		SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if (dateFinComptage!=null){
			try {
				return ff.parse(dateFinComptage);
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
	
	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public int getResultat() {
		return resultat;
	}

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}

	public Date getDateDebutComptage() {
		return dateDebutComptage;
	}

	public void setDateDebutComptage(Date dateDebutComptage) {
		this.dateDebutComptage = dateDebutComptage;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDateFinComptage(String dateFinComptage) {
		this.dateFinComptage = dateFinComptage;
	}

	
}
