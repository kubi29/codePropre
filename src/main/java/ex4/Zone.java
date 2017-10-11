package ex4;

import java.util.ArrayList;

public class Zone {

	
	protected ArrayList<Animal> animaux;
	
	public Zone(){
		super();
		animaux = new ArrayList<>();
		
	}
	
	public void addAnimal(Animal animal  ) {
		 animaux.add(animal);
		
	}
	public void afficherListeAnimaux(){
		
		for (Animal animal: animaux){
		System.out.println(animal.getNoms());
		}
	
	
	}

	public double calculerKgsNourritureParJour(){
		return animaux.size() * 10;
	}
	
	
	
}
