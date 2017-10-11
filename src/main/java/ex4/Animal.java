package ex4;

public class Animal {

	private String types;
	private String noms;
	private String comportements;
	
	public Animal (){
		
	}
	
	public Animal(String types , String noms , String comportements){
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}
	
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getNoms() {
		return noms;
	}
	public void setNoms(String noms) {
		this.noms = noms;
	}
	public String getComportements() {
		return comportements;
	}
	public void setComportements(String comportements) {
		this.comportements = comportements;
	}
	
	
	
}
