/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LABKOM
 */
public class halamankasir extends javax.swing.JFrame {

    userprofile p;

    /**
     * Creates new form KasirPage
     */
    public halamankasir() {
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

        jPanel1 = new javax.swing.JPanel();
        txtProduk = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        lblTotalHarga = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUangBayar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbluangKembali = new javax.swing.JLabel();
        tombolCheckout = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 80));

        txtProduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdukActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Product");

        jButton1.setText("Laporan  Keuangan Harian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        lblTotalHarga.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotalHarga.setForeground(new java.awt.Color(255, 0, 0));
        lblTotalHarga.setText("Rp. 0,-");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total Harga : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nominal : ");

        txtUangBayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUangBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUangBayarActionPerformed(evt);
            }
        });
        txtUangBayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUangBayarKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Kembalian : ");

        lbluangKembali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbluangKembali.setForeground(new java.awt.Color(0, 153, 51));
        lbluangKembali.setText("Rp 0,-");

        tombolCheckout.setBackground(new java.awt.Color(255, 102, 0));
        tombolCheckout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tombolCheckout.setForeground(new java.awt.Color(255, 255, 255));
        tombolCheckout.setText("Checkout");
        tombolCheckout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tombolCheckout.setEnabled(false);
        tombolCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCheckoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txtUangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addComponent(lblTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbluangKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(tombolCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalHarga)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUangBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tombolCheckout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbluangKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel6, java.awt.BorderLayout.PAGE_END);

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA PRODUK", "QTY", "HARGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCart.setRowHeight(30);
        jScrollPane1.setViewportView(tblCart);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdukActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
            model.addTableModelListener((TableModelEvent e) -> {
                int row = e.getFirstRow();
                int column = e.getColumn();
                if (row >= 0 && column >= 0) {
                    updateTotalHarga();
                    endsKetikUangPembayaran();
                }
            });

            String kode = txtProduk.getText();
            Connection K = koneksi.Go();
            Statement S = K.createStatement();
            String Q = "SELECT * FROM products WHERE product_code='" + kode + "'";
            ResultSet R = S.executeQuery(Q);
            while (R.next()) {
                int id = R.getInt("id");
                String nama = R.getString("product_name");
                String harga = R.getString("product_price_s");

                //pengecekan, apakah produk sudah ada di
                //keranjang/belum
                int row = tblCart.getRowCount();
                boolean ada = false;
                int QTY = 0;
                int baris = 0;
                if (row > 0) {
                    for (int i = 0; i < row; i++) {
                        int id_produk = Integer.parseInt(tblCart.getValueAt(i, 0).toString());
                        if (id_produk == id) {
                            ada = true;
                            baris = i;
                            QTY = Integer.parseInt(tblCart.getValueAt(i, 2).toString()) + 1;
                            break;
                        }
                    }
                    if (ada) {
                        tblCart.setValueAt(QTY, baris, 2);
                        updateTotalHarga();
                    } else {
                        Object[] data = {id, nama, 1, harga};
                        model.addRow(data);
                    }
                } else {
                    Object[] data = {id, nama, 1, harga};
                    model.addRow(data);
                }
            }

            
            updateTotalHarga();
            endsKetikUangPembayaran();
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_txtProdukActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUangBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUangBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUangBayarActionPerformed

    private void txtUangBayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUangBayarKeyReleased
        endsKetikUangPembayaran();
    }//GEN-LAST:event_txtUangBayarKeyReleased

    private void tombolCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCheckoutActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        delFromCart();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(halamankasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(halamankasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(halamankasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(halamankasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new halamankasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotalHarga;
    private javax.swing.JLabel lbluangKembali;
    private javax.swing.JTable tblCart;
    private javax.swing.JButton tombolCheckout;
    private javax.swing.JTextField txtProduk;
    private javax.swing.JTextField txtUangBayar;
    // End of variables declaration//GEN-END:variables


    private void updateTotalHarga() {
        try {
            double total = 0;
            int r = tblCart.getRowCount();
            for (int i = 0; i < r; i++) {
                double QTY = Double.parseDouble(tblCart.getValueAt(i, 2).toString());
                double PRC = Double.parseDouble(tblCart.getValueAt(i, 3).toString());
                total += (QTY * PRC);
            }
            lblTotalHarga.setText("Rp " + (long) total);
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void delFromCart() {
        int b = tblCart.getSelectedRow();
        if (b != -1) {
            DefaultTableModel m = (DefaultTableModel) tblCart.getModel();
            m.removeRow(b);
            
            
            updateTotalHarga();
            endsKetikUangPembayaran();
        } else {
            JOptionPane.showMessageDialog(this, "Anda belum memilih data");
        }
    }

    private void endsKetikUangPembayaran() {
        int r = tblCart.getRowCount();
        if (r > 0) {
            String lbl = lblTotalHarga.getText(); //Rp 12000
            String[] arrayHarga = lbl.split(" ");
            long harga = Long.parseLong(arrayHarga[1]);

            String bayar = txtUangBayar.getText();
            if (!bayar.isEmpty()) {
                long uangbayar = Long.parseLong(bayar);
                long uangkembali = uangbayar - harga;
                lbluangKembali.setText("Rp "+uangkembali); 
                
                if(uangbayar >= harga){
                    tombolCheckout.setEnabled(true); 
                }else {
                    tombolCheckout.setEnabled(false); 
                }
            }else{
                lbluangKembali.setText("Rp "+0);
                tombolCheckout.setEnabled(false); 
            }
        }
    }
}
