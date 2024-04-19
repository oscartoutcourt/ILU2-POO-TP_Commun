package frontiere;

import java.util.Scanner;

import control.ControlReserverTable;

public class BoundaryReserverTable {
	private ControlReserverTable controlReserverTable;
	private Scanner sc=new Scanner(System.in); 
	
	public BoundaryReserverTable(ControlReserverTable controlReserverTable) {
		this.controlReserverTable=controlReserverTable;
	}
	
	public void reserverTable(int numClient) {
		System.out.println("Quand souhaitez vous réserver ?\nPour quelle mois ?");
		int mois=sc.nextInt();
		System.out.println("Pour quel jour ?");
		int jour=sc.nextInt();
		System.out.println("Pour combien de personnes ?");
		int nbPersonnes=sc.nextInt();
		System.out.println("Pour quel service ?");
		int service=sc.nextInt();
		int[] possiblitees = controlReserverTable.trouverPossibilite(jour, mois, nbPersonnes, service);
		
		for(int i=1; i<possiblitees.length; i++) {
			System.out.println("numéro de table:"+possiblitees[i]);
		}
		System.out.println("Choisissez votre table");
		int numTable=sc.nextInt();
		controlReserverTable.reserver(numClient, numTable, possiblitees[0]);
	}
}
