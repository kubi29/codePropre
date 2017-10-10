package ex3;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	public LivretA(String type, double solde, double decouvert,double tauxRemuneration) {
		super(type, solde,0);
		
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
			if (getSolde() - montant > 0){
				setSolde(getSolde() - montant);
			}	
	}
	
	public void appliquerRemuAnnuelle(){
		
			setSolde(getSolde() + getSolde()*tauxRemuneration/100);
		
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
