package model;

public class ReservationRestaurant extends Reservation{
	private int service;
	private int table;
	public ReservationRestaurant(int jour, int mois, int service, int table) {
		super(jour,mois);
		this.service=service;
		this.table=table;
	}
	public String toString() {
		if(service==1) {
			return super.toString()+"Table "+table+" pour le premier service.";
		}else {
			return super.toString()+"Table "+table+" pour le deuxième service.";
		}
	}
}
