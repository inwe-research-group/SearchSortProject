/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package uni.aed.gui;

import java.awt.event.KeyEvent;

/**
 *
 * @author hp
 */
public class FrmAED extends javax.swing.JFrame {

    /**
     * Creates new form FrmAED
     */
    public FrmAED() {
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

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        mOptions = new javax.swing.JMenu();
        mSortSearchNumber = new javax.swing.JMenuItem();
        mSortSearchObject = new javax.swing.JMenuItem();
        mLinkedListNumber = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI-FC-CC232-AED-2023-2");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        mOptions.setMnemonic('f');
        mOptions.setText("Options");

        mSortSearchNumber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSortSearchNumber.setMnemonic('o');
        mSortSearchNumber.setText("Sort & Search Number");
        mSortSearchNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSortSearchNumberActionPerformed(evt);
            }
        });
        mOptions.add(mSortSearchNumber);

        mSortSearchObject.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSortSearchObject.setMnemonic('s');
        mSortSearchObject.setText("Sort & Search Object");
        mSortSearchObject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSortSearchObjectActionPerformed(evt);
            }
        });
        mOptions.add(mSortSearchObject);

        mLinkedListNumber.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mLinkedListNumber.setMnemonic('a');
        mLinkedListNumber.setText("LinkedList Number");
        mLinkedListNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLinkedListNumberActionPerformed(evt);
            }
        });
        mOptions.add(mLinkedListNumber);
        mOptions.add(jSeparator1);

        mSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mOptions.add(mSalir);

        menuBar.add(mOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mLinkedListNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLinkedListNumberActionPerformed
        // TODO add your handling code here:
        FrmLinkedList v=new FrmLinkedList();        
        v.setVisible(true);
    }//GEN-LAST:event_mLinkedListNumberActionPerformed

    private void mSortSearchNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSortSearchNumberActionPerformed
        // TODO add your handling code here:
        FrmSortDataSimple v=new FrmSortDataSimple();        
        v.setVisible(true);         
    }//GEN-LAST:event_mSortSearchNumberActionPerformed

    private void mSortSearchObjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSortSearchObjectActionPerformed
        // TODO add your handling code here:
        FrmDirectorio v=new FrmDirectorio();        
        v.setVisible(true);    
    }//GEN-LAST:event_mSortSearchObjectActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose(); // Cierra el formulario
         }
    }//GEN-LAST:event_formKeyPressed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();        
    }//GEN-LAST:event_mSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAED.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAED().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mLinkedListNumber;
    private javax.swing.JMenu mOptions;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenuItem mSortSearchNumber;
    private javax.swing.JMenuItem mSortSearchObject;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}