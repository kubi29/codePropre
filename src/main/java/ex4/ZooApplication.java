package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("MAMMIFERE","Gazelle","HERBIVORE"));
		zoo.addAnimal(new Animal("MAMMIFERE", "Zèbre", "HERBIVORE") );
		zoo.addAnimal(new Animal("MAMMIFERE", "Lion", "CARNIVORE"));
		zoo.addAnimal(new Animal("MAMMIFERE","Panthère",  "CARNIVORE"));
		zoo.addAnimal(new Animal("POISSON", "Requin blanc",  "HERBIVORE" ));
		zoo.addAnimal(new Animal("POISSON", "Truite dorée",  "HERBIVORE" ));
		zoo.addAnimal(new Animal("SERPENT","Boa constrictor", "CARNIVORE" ));
		zoo.addAnimal(new Animal("SERPENT","Python", "CARNIVORE" ));
		
		zoo.afficherListeAnimaux();
	}

}
