package model;

public class Restaurant {
	private CentralReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centralReservation= 
			new CentralReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant>(new Table[10]);
	
	private static class Table extends EntiteReservable<FormulaireRestaurant>{
		private CalendrierAnnuel calendrierDeuxiemeService= new CalendrierAnnuel();
		private int nbChaises;
		public Table(int nbChaises) {
			this.nbChaises=nbChaises;
		}
		
		public boolean compatible(FormulaireRestaurant f) {
			boolean libre;
			if(f.getNumService()==1) {
				libre=super.estLibre(f);
			}else {
				libre=calendrierDeuxiemeService.estLibre(f.getJour(), f.getMois());
			}
			return (f.getNombrePersonnes()==nbChaises || f.getNombrePersonnes()==nbChaises-1) && libre;
		}
		
		public ReservationRestaurant reserver(FormulaireRestaurant f) {
			if(f.getNumService()==1) {
				if(super.calendrier.reserver(f.getJour(), f.getMois())) {
					return new ReservationRestaurant(f.getJour(),f.getMois(),f.getNumService(),f.getIdentificationEntite());
				}
			}else {
				if(calendrierDeuxiemeService.reserver(f.getJour(), f.getMois())) {
					return new ReservationRestaurant(f.getJour(),f.getMois(),f.getNumService(),f.getIdentificationEntite());
				}
			}
			return null;
		}
	}
	
	public void ajouterTable(int nbChaises) {
		Table table = new Table(nbChaises);
		table.setId(centralReservation.ajouterEntite(table));
	}
	
	public int[] donnerPossibilites(FormulaireRestaurant f) {
		return centralReservation.donnerPossibilites(f);
	}
	
	public Reservation reserver(int numId, FormulaireRestaurant f) {
		return centralReservation.reserver(numId, f);
	}
}
