package ex4;



public class ZoneCarnivore extends Zone{

	public static final String NOM = "Zone Carnivore";
	
	public double calculerKgsNourritureParJour(){

		return animaux.size() * 10;

	}

}
