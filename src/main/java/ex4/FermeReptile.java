package ex4;


public class FermeReptile extends Zone{

	public static final String NOM = "Ferme Reptile";
	
	public double calculerKgsNourritureParJour(){

		return animaux.size() * 0.1;

	}
	
}
