package tugas.formulir.mahasiswa;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormMahasiswa extends javax.swing.JFrame {

    public FormMahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFipk = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMhs = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLnim = new javax.swing.JLabel();
        jLnama = new javax.swing.JLabel();
        jLprodi = new javax.swing.JLabel();
        jLipk = new javax.swing.JLabel();
        jTFnim = new javax.swing.JTextField();
        jTFnama = new javax.swing.JTextField();
        jTFprodi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });

        jTableMhs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Program Studi", "IPK"
            }
        ));
        jScrollPane1.setViewportView(jTableMhs);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("FORMULIR MAHASISWA");

        jLnim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLnim.setText("NIM");

        jLnama.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLnama.setText("Nama");

        jLprodi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLprodi.setText("Program Studi");
        jLprodi.setToolTipText("");

        jLipk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLipk.setText("IPK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFnim)
                                    .addComponent(jTFnama)
                                    .addComponent(jTFprodi)
                                    .addComponent(jLprodi)
                                    .addComponent(jLnama)
                                    .addComponent(jLnim)
                                    .addComponent(jLipk)
                                    .addComponent(jTFipk, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnupdate)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLnama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLprodi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFprodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLipk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(btndel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMhs.getModel();
        try {
            int nim = Integer.parseInt(jTFnim.getText());
            String nama = jTFnama.getText();
            String prodi = jTFprodi.getText();
            Double ipk = Double.parseDouble(jTFipk.getText());
            Object[] o = {nim, nama, prodi, ipk};
            int pil = JOptionPane.showConfirmDialog(this, "Apakah anda ingin menambahkan data ?", "Tambah data", JOptionPane.YES_NO_OPTION);
            if (pil == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Data DiTambahkan");
                model.addRow(o);
            } else if (pil == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Data Tidak DiTambahkan");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Masukkan Data / Data Salah ",
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMhs.getModel();

        try {
            int pil = JOptionPane.showConfirmDialog(this, "Apakah Anda ingin merubah data ?", "Update Data", JOptionPane.YES_NO_OPTION);
            if (pil == JOptionPane.YES_OPTION) {
                int upd = jTableMhs.getSelectedRow();
                model.setValueAt(jTFnim.getText(), upd, 0);
                model.setValueAt(jTFnama.getText(), upd, 1);
                model.setValueAt(jTFprodi.getText(), upd, 2);
                model.setValueAt(jTFipk.getText(), upd, 3);
                JOptionPane.showMessageDialog(this, "Data Telah di Update");
            } else if (pil == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Data tidak di Update");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Data Belum Dipilih",
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMhs.getModel();
        try {

            int pil = JOptionPane.showConfirmDialog(this, "Apakah anda ingin menghapus data ?", "Hapus data", JOptionPane.YES_NO_OPTION);
            if (pil == JOptionPane.YES_OPTION) {
                int del = jTableMhs.getSelectedRow();
                model.removeRow(del);
                JOptionPane.showMessageDialog(this, "Data di hapus");
            } else if (pil == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(this, "Data tidak di hapus");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Pilih Data",
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btndelActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLipk;
    private javax.swing.JLabel jLnama;
    private javax.swing.JLabel jLnim;
    private javax.swing.JLabel jLprodi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFipk;
    private javax.swing.JTextField jTFnama;
    private javax.swing.JTextField jTFnim;
    private javax.swing.JTextField jTFprodi;
    private javax.swing.JTable jTableMhs;
    // End of variables declaration//GEN-END:variables
}
