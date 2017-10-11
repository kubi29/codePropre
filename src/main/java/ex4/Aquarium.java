package ex4;


public class Aquarium extends Zone {

	public static final String NOM = "Aquarium";
	
	public double calculerKgsNourritureParJour(){

		return animaux.size() * 0.2;

	}
}
