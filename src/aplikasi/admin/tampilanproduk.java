/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi.admin;

import aplikasi.fungsi;
import aplikasi.koneksi;
import aplikasi.userprofile;
import static aplikasi.admin.tampilanuser.viewData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class tampilanproduk extends javax.swing.JFrame {
    userprofile pr;

    /**
     * Creates new form 
     */
    public tampilanproduk() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
    }
    
    public tampilanproduk(userprofile pr) {
        initComponents();
        this.pr = pr; // Simpan objek userprofile
        viewdataproduk("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnhapus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtrefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        keysearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableproduk = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setToolTipText("");

        btnhapus.setBackground(new java.awt.Color(255, 51, 51));
        btnhapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setText("hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/undo.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("tambah");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Edit");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtrefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrefresh.setText("refresh");
        txtrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrefreshActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        keysearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keysearchActionPerformed(evt);
            }
        });
        keysearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keysearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(txtrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton3)
                .addGap(7, 7, 7)
                .addComponent(btnhapus)
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(keysearch, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtrefresh))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jButton3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnhapus))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(keysearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tableproduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "ID", "KODE PRODUK", "NAMA PRODUK", "GAMBAR", "KATEGORI", "SUPPLIER", "HARGA JUAL", "HARGA BELI", "STOK"
            }
        ));
        jScrollPane2.setViewportView(tableproduk);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
            int n = tableproduk.getSelectedRow();
            if(n != -1){
            int id = Integer.parseInt(tableproduk.getValueAt(n,1).toString());
            String product_name = tableproduk.getValueAt(n, 3).toString();
//            JOptionPane.showMessageDialog(this, id); 
            
            int pilihan = JOptionPane.showConfirmDialog(this, 
                    "Apakah Anda yakin untuk menghapus data "+product_name+" ini?",
                    "Hapus Data",
                    JOptionPane.YES_NO_OPTION);
            if(pilihan == 0){
                //yes
                String Q = "DELETE FROM products"
                + " WHERE id="+id+" ";

                try {
                    Connection K = koneksi.Go();
                    Statement S = K.createStatement();
                    S.executeUpdate(Q);
                    viewdataproduk(""); 
                    JOptionPane.showMessageDialog(this, "Data "+product_name+" telah terhapus");
                    fungsi.savelog("Produk "+product_name+" berhasil dihapus "); 
                } catch (SQLException e) {
                }
            }
            
        }else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:);
        halamanadmin ha = new halamanadmin();
        ha.updateUser(this.pr); // Pastikan Anda menyimpan objek userprofile di tampilan user
        ha.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tambahproduk tp = new tambahproduk(this, true);
        tp.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int n = tableproduk.getSelectedRow();
        if (n != -1) {
            int id = Integer.parseInt(tableproduk.getValueAt(n, 1).toString());
            String KP = tableproduk.getValueAt(n, 2).toString();
            String NP = tableproduk.getValueAt(n, 3).toString();
            String GP = tableproduk.getValueAt(n, 4).toString();
            String K = tableproduk.getValueAt(n, 5).toString();
            String S = tableproduk.getValueAt(n, 6).toString();
            String HJ = tableproduk.getValueAt(n, 7).toString();
            String HB = tableproduk.getValueAt(n, 8).toString();
            String SP = tableproduk.getValueAt(n, 9).toString();

            editproduk E = new editproduk(this, true);
            E.setId(id);
            E.setKP(KP);
            E.setNP(NP);
            E.setGP(GP);
            E.setK(K);
            E.setS(S);
            E.setHJ(HJ);
            E.setHB(HB);
            E.setSP(SP);
            E.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih data yang akan diedit");
        }
     

    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrefreshActionPerformed
        // TODO add your handling code here:
        viewdataproduk("");
       
    }//GEN-LAST:event_txtrefreshActionPerformed

    private void keysearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keysearchKeyReleased
        String key =keysearch.getText();
        String w = "WHERE "
                + "product_code LIKE '%" + key + "%' "
                + "OR product_name LIKE '%" + key + "%' "
                + "OR product_category LIKE '%" + key + "%'"
                + "OR product_supplier LIKE '%" + key + "%'";
        viewdataproduk(w);
        
    }//GEN-LAST:event_keysearchKeyReleased

    private void keysearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keysearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keysearchActionPerformed

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
            java.util.logging.Logger.getLogger(tampilanproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tampilanproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tampilanproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tampilanproduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tampilanproduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField keysearch;
    private static javax.swing.JTable tableproduk;
    private javax.swing.JButton txtrefresh;
    // End of variables declaration//GEN-END:variables
        
    
        public static void viewdataproduk(String where) { 
        try {
            DefaultTableModel m = (DefaultTableModel) tableproduk.getModel();
            m.getDataVector().removeAllElements();
            Connection K = koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM products " + where;
//            System.out.println(Q);
            ResultSet R = S.executeQuery(Q);
            int no = 1;
            while (R.next()) {
                int id = R.getInt("id");
                String p_code = R.getString("product_code");
                String p_name = R.getString("product_name");
                String p_image = R.getString("product_image");
                String p_category  = R.getString("product_category");
                String p_supplier = R.getString("product_supplier");
                String p_price_s = R.getString("product_price_s");
                String p_price_b = R.getString("product_price_b");
                String p_stock = R.getString("product_stock");

                Object[] D = {
                    no, id, p_code,p_name, p_image, 
                    p_category, p_supplier, p_price_s, p_price_b, p_stock};
                m.addRow(D);

                no++;
            }
        } catch (SQLException e) {
            //error handling
        }
    }
        

}