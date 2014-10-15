/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cbs.flow.eank;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Edgars
 */
public class FlowUI extends javax.swing.JFrame {
    private List<Person> people = new ArrayList<>();
    private DefaultListModel<Person> personModel;
    /**
     * Creates new form FlowUI
     */
    public FlowUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPerson = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAdmin = new javax.swing.JTextField();
        txtAnalysis = new javax.swing.JTextField();
        txtCreativity = new javax.swing.JTextField();
        txtFinish = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAddPerson = new javax.swing.JButton();
        btnReadPeople = new javax.swing.JButton();
        txtFile = new javax.swing.JTextField();
        btnSavePeople = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPerson = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPerson.setMinimumSize(new java.awt.Dimension(80, 20));

        jLabel1.setText("Name");

        jLabel2.setText("Administration");

        jLabel3.setText("Creativity");

        jLabel4.setText("Analysis");

        jLabel5.setText("Finishing");

        txtName.setEditable(false);
        txtName.setMinimumSize(new java.awt.Dimension(80, 20));

        txtAdmin.setEditable(false);
        txtAdmin.setMinimumSize(new java.awt.Dimension(80, 20));

        txtAnalysis.setEditable(false);
        txtAnalysis.setMinimumSize(new java.awt.Dimension(80, 20));

        txtCreativity.setEditable(false);
        txtCreativity.setMinimumSize(new java.awt.Dimension(80, 20));

        txtFinish.setEditable(false);
        txtFinish.setMinimumSize(new java.awt.Dimension(80, 20));

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPersonLayout = new javax.swing.GroupLayout(pnlPerson);
        pnlPerson.setLayout(pnlPersonLayout);
        pnlPersonLayout.setHorizontalGroup(
            pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPersonLayout.createSequentialGroup()
                        .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave))
                    .addGroup(pnlPersonLayout.createSequentialGroup()
                        .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCreativity, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(txtAnalysis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnAddPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlPersonLayout.setVerticalGroup(
            pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCreativity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFinish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPersonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddPerson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnReadPeople.setText("Read People");
        btnReadPeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadPeopleActionPerformed(evt);
            }
        });

        txtFile.setText("person.txt");

        btnSavePeople.setText("Save People");
        btnSavePeople.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePeopleActionPerformed(evt);
            }
        });

        listPerson.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Load File" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listPerson.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPersonValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPerson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnReadPeople, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSavePeople, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtFile, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReadPeople)
                    .addComponent(btnSavePeople))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadPeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadPeopleActionPerformed
       try{
            PersonFileReader reader = new PersonFileReader(txtFile.getText());
            people = reader.readPeople();
            personModel = new DefaultListModel();
            for(Person p : people){
                personModel.addElement(p);
            }
            listPerson.setModel(personModel);
            
       } catch(FileNotFoundException ex){}
        
       
    }//GEN-LAST:event_btnReadPeopleActionPerformed

    private void listPersonValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPersonValueChanged
        JList source = (JList)evt.getSource();
        Person selected = (Person)source.getSelectedValue();
        txtName.setText(selected.getName());
        txtAdmin.setText(Integer.toString(selected.getAdminstration()));
        txtAnalysis.setText(Integer.toString(selected.getAnalysis()));
        txtCreativity.setText(Integer.toString(selected.getCreativity()));
        txtFinish.setText(Integer.toString(selected.getFinishing()));
    }//GEN-LAST:event_listPersonValueChanged

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        enableEdit();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Person selected = (Person)listPerson.getSelectedValue();
        
        selected.setName(txtName.getText());
        selected.setAdminstration(Integer.parseInt(txtAdmin.getText()));
        selected.setAnalysis(Integer.parseInt(txtAnalysis.getText()));
        selected.setCreativity(Integer.parseInt(txtCreativity.getText()));
        selected.setFinishing(Integer.parseInt(txtFinish.getText()));
        changeState(true);
        listPerson.updateUI();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        Person p = new Person("New Person", 0, 0, 0, 0);
        personModel.addElement(p);
        people.add(p);
        enableEdit();
        listPerson.updateUI();
        listPerson.setSelectedValue(p, false);
        changeState(false);
        txtName.requestFocusInWindow();
        txtName.selectAll();
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnSavePeopleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePeopleActionPerformed
        try {
            PersonFileWriter writer = new PersonFileWriter(txtFile.getText());
            writer.writePeople(people);
        }catch(IOException ex){}
        
    }//GEN-LAST:event_btnSavePeopleActionPerformed
    private void enableEdit(){
        txtName.setEditable(true);
        txtAdmin.setEditable(true);
        txtAnalysis.setEditable(true);
        txtCreativity.setEditable(true);
        txtFinish.setEditable(true);
    }
    private void changeState(boolean activate){
        btnEdit.setEnabled(activate);
        btnAddPerson.setEnabled(activate);
        btnReadPeople.setEnabled(activate);
        btnSavePeople.setEnabled(activate);
        listPerson.setEnabled(activate);
        txtFile.setEnabled(activate);
        listPerson.setFocusable(activate);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FlowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlowUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlowUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReadPeople;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSavePeople;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listPerson;
    private javax.swing.JPanel pnlPerson;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtAnalysis;
    private javax.swing.JTextField txtCreativity;
    private javax.swing.JTextField txtFile;
    private javax.swing.JTextField txtFinish;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    
}