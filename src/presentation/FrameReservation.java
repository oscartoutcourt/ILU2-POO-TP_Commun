/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButtonDialog = new javax.swing.JButton();
        jLabelDialog = new javax.swing.JLabel();
        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        jComboBoxHourPicker = new javax.swing.JComboBox<>();
        jLabelDate = new javax.swing.JLabel();
        jLabelHeure = new javax.swing.JLabel();
        nbPersonsPanel = new javax.swing.JPanel();
        jComboBoxNbPersonnes = new javax.swing.JComboBox<>();
        jLabelNbPersonnes = new javax.swing.JLabel();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jLabelTable = new javax.swing.JLabel();
        jButtonAnnuler = new javax.swing.JButton();
        jButtonValider = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTable = new javax.swing.JList<>();

        jDialog1.setTitle("Confirmation de réservation");
        jDialog1.setLocation(new java.awt.Point(200, 250));
        jDialog1.setSize(new java.awt.Dimension(400, 300));

        jButtonDialog.setText("OK");
        jButtonDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDialogActionPerformed(evt);
            }
        });

        jLabelDialog.setText("jLabel1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDialog)
                .addGap(43, 43, 43))
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabelDialog)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabelDialog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jButtonDialog)
                .addGap(28, 28, 28))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Réservez une table");

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxHourPicker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11h30", "12h00", "12h30", "13h00", "13h30" }));
        jComboBoxHourPicker.setSelectedItem(jComboBoxHourPicker.getSelectedItem());
        jComboBoxHourPicker.setEnabled(false);
        jComboBoxHourPicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHourPickerActionPerformed(evt);
            }
        });

        jLabelDate.setText("1. Choisissez la date");

        jLabelHeure.setText("2. Choisissez l'heure");
        jLabelHeure.setEnabled(false);

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDate)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelHeure, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate)
                    .addComponent(jLabelHeure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxHourPicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jComboBoxNbPersonnes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", " " }));
        jComboBoxNbPersonnes.setSelectedItem(jComboBoxNbPersonnes.getSelectedItem());
        jComboBoxNbPersonnes.setEnabled(false);
        jComboBoxNbPersonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNbPersonnesActionPerformed(evt);
            }
        });

        jLabelNbPersonnes.setText("3. Indiquez le nombre de personnes");
        jLabelNbPersonnes.setEnabled(false);

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNbPersonnes)
                    .addComponent(jComboBoxNbPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNbPersonnes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxNbPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablesImage.setEnabled(false);

        jLabelTable.setText("4. Choisissez votre table");
        jLabelTable.setEnabled(false);

        jButtonAnnuler.setText("Annuler");
        jButtonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnulerActionPerformed(evt);
            }
        });

        jButtonValider.setText("Valider");
        jButtonValider.setEnabled(false);
        jButtonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValiderActionPerformed(evt);
            }
        });

        jListTable.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListTable.setEnabled(false);
        jListTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListTableValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListTable);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTable)
                        .addGap(518, 518, 518)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(tablesImage)
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pickTablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonValider)
                .addGap(37, 37, 37)
                .addComponent(jButtonAnnuler)
                .addGap(40, 40, 40))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTable)
                .addGap(20, 20, 20)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(tablesImage)
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnnuler)
                    .addComponent(jButtonValider))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxHourPickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHourPickerActionPerformed
        dialog.handleTimeSelectedEvent(jComboBoxHourPicker.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxHourPickerActionPerformed

    private void jComboBoxNbPersonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNbPersonnesActionPerformed
        dialog.handleNumOfPersonsSelectedEvent(Integer.valueOf(jComboBoxNbPersonnes.getSelectedItem().toString()));
    }//GEN-LAST:event_jComboBoxNbPersonnesActionPerformed

    private void jButtonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnulerActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_jButtonAnnulerActionPerformed

    private void jButtonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValiderActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_jButtonValiderActionPerformed

    private void jListTableValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListTableValueChanged
        int size= jListTable.getSelectedValue().length();
        dialog.handleTableSelectedEvent(Integer.parseInt(jListTable.getSelectedValue().substring(size-1)));
    }//GEN-LAST:event_jListTableValueChanged

    private void jButtonDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDialogActionPerformed
        jDialog1.hide();
        dialog.handleCancelEvent();
    }//GEN-LAST:event_jButtonDialogActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(dateEvent.getNewDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JButton jButtonAnnuler;
    private javax.swing.JButton jButtonDialog;
    private javax.swing.JButton jButtonValider;
    private javax.swing.JComboBox<String> jComboBoxHourPicker;
    private javax.swing.JComboBox<String> jComboBoxNbPersonnes;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelDialog;
    private javax.swing.JLabel jLabelHeure;
    private javax.swing.JLabel jLabelNbPersonnes;
    private javax.swing.JLabel jLabelTable;
    private javax.swing.JList<String> jListTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel tablesImage;
    // End of variables declaration//GEN-END:variables
    public void enableHourPicker(){
        jComboBoxHourPicker.setEnabled(true);
        jLabelHeure.setEnabled(true);
    }
    public void enableNbPersonnes(){
        jComboBoxNbPersonnes.setEnabled(true);
        jLabelNbPersonnes.setEnabled(true);
    }
    public void enableTable(){
        tablesImage.setEnabled(true);
        jLabelTable.setEnabled(true);
        jListTable.setEnabled(true);
    }
    public void enableBoutonValider(){
        jButtonValider.setEnabled(true);
    }
    public void disableAll(){
        jComboBoxHourPicker.setEnabled(false);
        jLabelHeure.setEnabled(false);
        jComboBoxNbPersonnes.setEnabled(false);
        jLabelNbPersonnes.setEnabled(false);
        tablesImage.setEnabled(false);
        jLabelTable.setEnabled(false);
        jListTable.setEnabled(false);
        jButtonValider.setEnabled(false);
    }
    
    public void showPopup(LocalDate date, String heure, int nbPersonnes, int numTable){
        jDialog1.setLocationRelativeTo(null);
        jDialog1.show();
        jLabelDialog.setText("<html>Réservation validée pour le "+date.getDayOfMonth()+" "+date.getMonth()+" à "+heure+" pour "+nbPersonnes+" à la table "+numTable);
    }
    public void setTableList(String[] listData){
        jListTable.setListData(listData);
    }
}
