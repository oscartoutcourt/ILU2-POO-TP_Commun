package model;

public class ReservationSpectacle extends Reservation{
	private int zone;
	private int place;
	public ReservationSpectacle(int jour, int mois, int zone, int place) {
		super(jour,mois);
		this.zone=zone;
		this.place=place;
	}
	public String toString() {
		return super.toString()+" zone n°"+zone+", place n°"+place+".";
	}
}
