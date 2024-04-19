package model;

public class FormulaireHotel extends Formulaire{
	protected int nbLitsSimple;
    protected int nbLitsDouble;

    public FormulaireHotel(int jour, int mois, int nbLitsSimple, int nbLitsDouble) {
        super(jour, mois);
        this.nbLitsSimple = nbLitsSimple;
        this.nbLitsDouble = nbLitsDouble;
    }

	public int getNbLitsSimple() {
		return nbLitsSimple;
	}

	public int getNbLitsDouble() {
		return nbLitsDouble;
	}
    
}
