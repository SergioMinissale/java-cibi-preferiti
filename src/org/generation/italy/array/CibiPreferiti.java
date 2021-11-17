package org.generation.italy.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"Sushi", "Pizza", "Carbonara", "Arancini", "Gricia", "Cheesecake", "Cannolo siciliano", "Hamburger", "Cacio e pepe", "Fritto misto"};
		
		int lunghezzaArray = cibiPreferiti.length;
		
		System.out.println("La classifica � composta da: " + lunghezzaArray + " posizioni");
		System.out.println("Il cibo top, che occupa quindi la prima posizione, �: " + cibiPreferiti[0]);
		System.out.println("Il cibo preferito ma non troppo, che occupa quindi l'ultima posizione, �: " + cibiPreferiti[lunghezzaArray - 1]);
		
		//guardo se l'array � pari oppure dispari
		int resto = lunghezzaArray % 2;
		
		int posizioneMediana = lunghezzaArray/2;
		//se l' array � pari o dispari avr� due situazioni diverse, quindi uso if ed else
		if(resto != 0) {					
			System.out.println("Il cibo che occupa la posizione mediana �: " + cibiPreferiti[posizioneMediana] );	
		} else {
			System.out.println("I cibi che occupano la posizione mediana sono: " + cibiPreferiti[posizioneMediana + 1] + " e " + cibiPreferiti[posizioneMediana - 1]);
			//in questo caso la mediana vera e propria non esiste e quindi ho preso in considerazione 2 posizioni
		}
	}

}
