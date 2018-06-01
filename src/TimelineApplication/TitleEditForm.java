package TimelineApplication;
import static TimelineApplication.Maintimeline.eventInformationFile;
import static TimelineApplication.Maintimeline.eventInformationList;
import static TimelineApplication.Maintimeline.numOfEvents;
import static TimelineApplication.Maintimeline.setTheTitle;
import static TimelineApplication.Maintimeline.skipLines;
import static TimelineApplication.Maintimeline.Title;
import static TimelineApplication.Maintimeline.updateScreen;
import javax.swing.JLabel;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.RandomAccessFile;
import javax.swing.JLabel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHAWN
 */
public class TitleEditForm extends javax.swing.JFrame {
    public static String title;
    /**
     * Creates new form TitleEditForm
     */
    public TitleEditForm() {
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

        EditTitleTitle = new javax.swing.JLabel();
        EditInstruction = new javax.swing.JLabel();
        TimelineTitleEdited = new javax.swing.JTextField();
        UpdateBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EditTitleTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        EditTitleTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditTitleTitle.setText("Edit Timeline Title");
        EditTitleTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        EditInstruction.setText("Enter Timeline Title below:");

        TimelineTitleEdited.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimelineTitleEditedActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(EditInstruction))
                            .addComponent(EditTitleTitle)
                            .addComponent(TimelineTitleEdited)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(UpdateBtn)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditTitleTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimelineTitleEdited, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimelineTitleEditedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimelineTitleEditedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimelineTitleEditedActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        
        title = TimelineTitleEdited.getText();
        updateScreen(numOfEvents);
        
        /*
        
        String EventFile = "src/TimelineApplication/eventsInformation.txt";
        title = TimelineTitleEdited.getText();        
        Title = title;
        String line = null;
        System.out.println(title);
        setTheTitle(title);
        ArrayList<String> allEvent = new ArrayList<String>();
        //Write to text file by shifting.
        try{
            Scanner sc = new Scanner(eventInformationFile);
                skipLines(sc, 1);
                System.out.println(numOfEvents*5);
                for(int i = 0; i <numOfEvents*5; i++){
                    allEvent.add(sc.nextLine());
                }
                allEvent.add(0,title);
            Writer fileWriter;
            fileWriter = new BufferedWriter(new FileWriter(EventFile, false));
            for (int j=0; j<allEvent.size();j++){
                fileWriter.write(allEvent.get(j));
                fileWriter.write("\n");
            }
            fileWriter.close();
        }
        catch (FileNotFoundException ex){
                System.out.println("Cannot find the file "+EventFile);
            }
        catch (IOException e) {
            System.out.println("Error when trying to read"+EventFile);
            }
        super.dispose();
        */
    }//GEN-LAST:event_UpdateBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TitleEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TitleEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TitleEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TitleEditForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TitleEditForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EditInstruction;
    private javax.swing.JLabel EditTitleTitle;
    private javax.swing.JTextField TimelineTitleEdited;
    private javax.swing.JButton UpdateBtn;
    // End of variables declaration//GEN-END:variables
}
