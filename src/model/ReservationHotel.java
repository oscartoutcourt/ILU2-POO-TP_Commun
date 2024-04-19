package model;

public class ReservationHotel extends Reservation{
	private int nbLitS;
	private int nbLitD;
	private int num;
	public ReservationHotel(int jour, int mois, int nbLitS, int nbLitD, int num) {
		super(jour,mois);
		this.nbLitS=nbLitS;
		this.nbLitD=nbLitD;
		this.num=num;
	}
	public String toString() {
		return super.toString()+" Chambre n°"+num+", "+nbLitS+" lits simples et "+nbLitD+" lits doubles.";
	}
}
