package ex4;


public class SavaneAfricaine extends Zone {

	public static final String NOM = "Savane Africaine";
	
	public double calculerKgsNourritureParJour(){

		return animaux.size() * 10;

	}
}
