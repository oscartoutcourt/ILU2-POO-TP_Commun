/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.AdaptateurDuNoyauFonctionnel;
import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import presentation.FrameReservation;

public class DialogReservation {
    private String heure;
    private LocalDate date;
    private int nbPersons;
    private int numTable;
    private int numClient;
    
    private FrameReservation frameReservation;
    private AdaptateurDuNoyauFonctionnel inf;

    public DialogReservation(AdaptateurDuNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        this.date=date;
        frameReservation.enableHourPicker();
    }

    public void handleTimeSelectedEvent(String heure) {
        this.heure=heure;
        frameReservation.enableNbPersonnes();
        
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        this.nbPersons=nbPersons;
        String[] listData=inf.trouverTableDisponible(date.getDayOfMonth(), date.getMonthValue(), nbPersons, heure);
        frameReservation.setTableList(listData);
        frameReservation.enableTable();
    }

    public void handleTableSelectedEvent(int numTable) {
        this.numTable=numTable;
        frameReservation.enableBoutonValider();
    }

    public void handleCancelEvent() {
        frameReservation.disableAll();
    }

    public void handleValidationEvent() {
        frameReservation.showPopup(date, heure, nbPersons, numTable);
    }
    
    public void handleUserConnected(int numClient) { 
    	this.numClient = numClient; 
    	frameReservation.setVisible(true);
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
