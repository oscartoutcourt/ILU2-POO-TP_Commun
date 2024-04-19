package model;

public abstract class EntiteReservable <P extends Formulaire>{
	protected CalendrierAnnuel calendrier=new CalendrierAnnuel();
	private int id;
	
	public Boolean estLibre(P formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public abstract boolean compatible(P formulaire);
    
    public abstract Reservation reserver(P formulaire);
}
