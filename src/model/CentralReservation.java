package model;

public class CentralReservation <T extends EntiteReservable<P>, P extends Formulaire> {
	private T[] entitesAReserver;
	private int nbEntites=0;
	
	public CentralReservation(T[] entitesAReserver) {
		this.entitesAReserver=entitesAReserver;
	}
	
	public int ajouterEntite(T entite) {
        entitesAReserver[nbEntites] = entite;
        nbEntites++;
        return nbEntites; 
    }
	
	public int[] donnerPossibilites(P formulaire) {
        int[] possibilites = new int[nbEntites];
        for (int i = 0; i < nbEntites; i++) {
            if(entitesAReserver[i].compatible(formulaire)) {
            	possibilites[i] = entitesAReserver[i].getId();
            }else {
            	possibilites[i] = 0;
            }
        }
        return possibilites;
    }
	
	public Reservation reserver(int numeroEntite, P formulaire) {
       formulaire.setIdentificationEntite(numeroEntite);
       return entitesAReserver[numeroEntite-1].reserver(formulaire);
    }
}
