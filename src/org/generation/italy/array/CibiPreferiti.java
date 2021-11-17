package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"Sushi", "Pizza", "Carbonara", "Arancini", "Gricia", "Cheesecake", "Cannolo siciliano", "Hamburger", "Cacio e pepe", "Fritto misto"};
		int lunghezzaArray = cibiPreferiti.length;
		
		System.out.println("La classifica è composta da: " + lunghezzaArray + " posizioni");
		System.out.println("Il cibo top, che occupa quindi la prima posizione, è: " + cibiPreferiti[0]);
		System.out.println("Il cibo preferito ma non troppo, che occupa quindi l'ultima posizione, è: " + cibiPreferiti[lunghezzaArray - 1]);
		
		
			

	}

}
