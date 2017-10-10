package ex2;

import java.text.ParseException;
import java.util.Date;

public class AppComptageStock {

	public static void main(String[] args) throws ParseException {
		
		ComptageStock comptageStock = new ComptageStock();
		Date date = new Date(1992 - 1900 , 6, 25 , 0,0,0);
		
		comptageStock.setDateDebutComptage(date);
		comptageStock.setDateFinComptage("25/06/1994 00:00:00");
		
		comptageStock.ajouterElement(18);
		comptageStock.afficheStatutComptage(TypesComptage.SOMME);
		
		comptageStock.ajouterElement(25);
		comptageStock.afficheStatutComptage(TypesComptage.MOYENNE);
		 
		
		
		
		
		
		
	}

}
