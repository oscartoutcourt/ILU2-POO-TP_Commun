package model;

public abstract class Formulaire {
	private int jour;
    private int mois;
    private int identificationEntite=0;

    public Formulaire(int jour, int mois) {
        this.jour = jour;
        this.mois = mois;
    }

	public int getIdentificationEntite() {
		return identificationEntite;
	}

	public void setIdentificationEntite(int identificationEntite) {
		this.identificationEntite = identificationEntite;
	}

	public void setJour(int jour) {
		this.jour = jour;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}
    
}
