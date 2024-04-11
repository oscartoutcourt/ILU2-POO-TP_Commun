package model;

public class CalendrierAnnuel {
	private Mois[] calendrier=new Mois[12];
	public CalendrierAnnuel() {
		calendrier[0]=new Mois(31,"Janvier");
		calendrier[1]=new Mois(28,"Février");
		calendrier[2]=new Mois(31,"Mars");
		calendrier[3]=new Mois(30,"Avril");
		calendrier[4]=new Mois(31,"Mai");
		calendrier[5]=new Mois(30,"Juin");
		calendrier[6]=new Mois(31,"Juillet");
		calendrier[7]=new Mois(31,"Août");
		calendrier[8]=new Mois(30,"Septembre");
		calendrier[9]=new Mois(31,"Octobre");
		calendrier[10]=new Mois(30,"Novembre");
		calendrier[11]=new Mois(31,"Décembre");
		
	}
	private static class Mois{
		private String nom;
		private Boolean[] jours;
		public Mois(int nbJours, String nom) {
			this.nom=nom;
			jours= new Boolean[nbJours];
			for(int i=0; i<nbJours; i++) {
				jours[i]=false;
			}
		}
		Boolean estLibre(int jour) {
			return !jours[jour];
		}
		void reserver(int jour) {
			if(!estLibre(jour)) {
				throw(new IllegalStateException());
			}
			jours[jour]=true; 	
		}
	}
	
	public Boolean estLibre(int jour, int mois) {
		return calendrier[mois-1].estLibre(jour-1);
	}
	public Boolean reserver(int jour, int mois) {
		try {
			calendrier[mois-1].reserver(jour-1);
		}catch(IllegalStateException e) {
			return false;
		}
		return true;
	}
}
