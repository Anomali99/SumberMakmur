/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import dao.DAO_laporan;
import service.service_laporan;

/**
 *
 * @author fatiq
 */
public class laporan_barang extends javax.swing.JPanel {

    /**
     * Creates new form admin_pelanggan
     */
    private service_laporan servis = new DAO_laporan();
    
    
    public laporan_barang() {
        initComponents();
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        main = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pn_pilih = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbx_laporan = new rojerusan.RSComboMetro();
        pn_pemesanan = new javax.swing.JPanel();
        lb_lapBar = new javax.swing.JLabel();
        btn_print2 = new rojerusan.RSMaterialButtonRectangle();
        btn_pilihB1 = new javax.swing.JButton();
        tf_tglPes1 = new javax.swing.JTextField();
        tf_tglPes2 = new javax.swing.JTextField();
        btn_pilihB2 = new javax.swing.JButton();
        pn_main = new javax.swing.JPanel();
        btn_kembali = new rojerusan.RSMaterialButtonRectangle();
        pn_data = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_print = new rojerusan.RSMaterialButtonRectangle();
        pn_transaksi = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_print1 = new rojerusan.RSMaterialButtonRectangle();
        tf_kodeB = new javax.swing.JTextField();
        tf_namaB = new javax.swing.JTextField();
        btn_pilihB = new javax.swing.JButton();
        pn_tampil = new javax.swing.JPanel();

        dateChooser.setDateFormat("yyyy-MM-dd");
        dateChooser.setTextRefernce(tf_tglPes1);

        dateChooser1.setDateFormat("yyyy-MM-dd");
        dateChooser1.setTextRefernce(tf_tglPes2);

        setLayout(new java.awt.CardLayout());

        main.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));
        tampilData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Laporan Barang");
        tampilData.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));
        tampilData.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1000, 10));

        pn_pilih.setBackground(new java.awt.Color(255, 255, 255));
        pn_pilih.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_pilih.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Barang");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 5, 300, 30));

        pn_pilih.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        cbx_laporan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Jenis Laporan --", "Laporan Data Barang", "Laporan Transaksi per Barang", "Laporan Transaksi Pemesanan", "Laporan Transaksi Supplay" }));
        cbx_laporan.setColorArrow(new java.awt.Color(0, 0, 0));
        cbx_laporan.setColorBorde(new java.awt.Color(255, 255, 255));
        cbx_laporan.setColorFondo(new java.awt.Color(0, 0, 0));
        cbx_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_laporanActionPerformed(evt);
            }
        });
        pn_pilih.add(cbx_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, -1));

        pn_pemesanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_pemesanan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_lapBar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_lapBar.setForeground(new java.awt.Color(0, 0, 0));
        lb_lapBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_lapBar.setText("Laporan Pemesanan Barang");

        btn_print2.setBackground(new java.awt.Color(0, 204, 51));
        btn_print2.setText("PRINT");
        btn_print2.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btn_print2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print2ActionPerformed(evt);
            }
        });

        btn_pilihB1.setBackground(new java.awt.Color(0, 0, 0));
        btn_pilihB1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pilihB1.setForeground(new java.awt.Color(255, 255, 255));
        btn_pilihB1.setText("...");
        btn_pilihB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihB1ActionPerformed(evt);
            }
        });

        tf_tglPes1.setEditable(false);
        tf_tglPes1.setBackground(new java.awt.Color(204, 204, 204));
        tf_tglPes1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_tglPes1.setForeground(new java.awt.Color(153, 153, 153));
        tf_tglPes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_tglPes2.setEditable(false);
        tf_tglPes2.setBackground(new java.awt.Color(204, 204, 204));
        tf_tglPes2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_tglPes2.setForeground(new java.awt.Color(153, 153, 153));
        tf_tglPes2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_pilihB2.setBackground(new java.awt.Color(0, 0, 0));
        btn_pilihB2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pilihB2.setForeground(new java.awt.Color(255, 255, 255));
        btn_pilihB2.setText("...");
        btn_pilihB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihB2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_pemesananLayout = new javax.swing.GroupLayout(pn_pemesanan);
        pn_pemesanan.setLayout(pn_pemesananLayout);
        pn_pemesananLayout.setHorizontalGroup(
            pn_pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pemesananLayout.createSequentialGroup()
                .addComponent(lb_lapBar, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pn_pemesananLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn_pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_pemesananLayout.createSequentialGroup()
                        .addComponent(tf_tglPes2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pilihB2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pn_pemesananLayout.createSequentialGroup()
                            .addComponent(tf_tglPes1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_pilihB1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_print2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_pemesananLayout.setVerticalGroup(
            pn_pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pemesananLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_lapBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_tglPes1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_pilihB1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(pn_pemesananLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pilihB2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tf_tglPes2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_print2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11))
        );

        pn_pilih.add(pn_pemesanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 160));

        pn_main.setBackground(new java.awt.Color(255, 255, 255));
        pn_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        pn_pilih.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 160));

        btn_kembali.setBackground(new java.awt.Color(0, 0, 0));
        btn_kembali.setText("KEMBALI");
        btn_kembali.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });
        pn_pilih.add(btn_kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 280, 40));

        pn_data.setBackground(new java.awt.Color(255, 255, 255));
        pn_data.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Laporan Data Barang");

        btn_print.setBackground(new java.awt.Color(0, 204, 51));
        btn_print.setText("PRINT");
        btn_print.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dataLayout = new javax.swing.GroupLayout(pn_data);
        pn_data.setLayout(pn_dataLayout);
        pn_dataLayout.setHorizontalGroup(
            pn_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
            .addGroup(pn_dataLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pn_dataLayout.setVerticalGroup(
            pn_dataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pn_pilih.add(pn_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 160));

        pn_transaksi.setBackground(new java.awt.Color(255, 255, 255));
        pn_transaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Laporan Transaksi per Barang");

        btn_print1.setBackground(new java.awt.Color(0, 204, 51));
        btn_print1.setText("PRINT");
        btn_print1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        btn_print1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_print1ActionPerformed(evt);
            }
        });

        tf_kodeB.setEditable(false);
        tf_kodeB.setBackground(new java.awt.Color(204, 204, 204));
        tf_kodeB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_kodeB.setForeground(new java.awt.Color(153, 153, 153));
        tf_kodeB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_namaB.setEditable(false);
        tf_namaB.setBackground(new java.awt.Color(204, 204, 204));
        tf_namaB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_namaB.setForeground(new java.awt.Color(153, 153, 153));
        tf_namaB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_pilihB.setBackground(new java.awt.Color(0, 0, 0));
        btn_pilihB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_pilihB.setForeground(new java.awt.Color(255, 255, 255));
        btn_pilihB.setText("...");
        btn_pilihB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_transaksiLayout = new javax.swing.GroupLayout(pn_transaksi);
        pn_transaksi.setLayout(pn_transaksiLayout);
        pn_transaksiLayout.setHorizontalGroup(
            pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
            .addGroup(pn_transaksiLayout.createSequentialGroup()
                .addGroup(pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_transaksiLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(tf_kodeB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pilihB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_namaB, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_transaksiLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btn_print1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pn_transaksiLayout.setVerticalGroup(
            pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksiLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_transaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_namaB)
                    .addComponent(tf_kodeB)
                    .addComponent(btn_pilihB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_print1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pn_pilih.add(pn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 280, 160));

        tampilData.add(pn_pilih, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 470));

        pn_tampil.setBackground(new java.awt.Color(255, 255, 255));
        pn_tampil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pn_tampil.setForeground(new java.awt.Color(0, 0, 0));
        tampilData.add(pn_tampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 690, 470));

        main.add(tampilData, "card2");

        add(main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        pn_tampil.removeAll();
        servis.lapDataBarang(pn_tampil);
    }//GEN-LAST:event_btn_printActionPerformed

    private void cbx_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_laporanActionPerformed
        if(cbx_laporan.getSelectedItem()=="-- Pilih Jenis Laporan --"){
            pn_main.setVisible(true);
            pn_data.setVisible(false);
            pn_transaksi.setVisible(false);
            pn_pemesanan.setVisible(false);
            btn_kembali.setVisible(false);                
        } else if(cbx_laporan.getSelectedItem()=="Laporan Data Barang"){
            pn_main.setVisible(false);
            pn_data.setVisible(true);
            pn_transaksi.setVisible(false);
            pn_pemesanan.setVisible(false);
            btn_kembali.setVisible(true);                       
        } else if(cbx_laporan.getSelectedItem()=="Laporan Transaksi per Barang"){
            pn_main.setVisible(false);
            pn_data.setVisible(false);
            pn_transaksi.setVisible(true);
            pn_pemesanan.setVisible(false);
            btn_kembali.setVisible(true);                       
        }else if(cbx_laporan.getSelectedItem()=="Laporan Transaksi Pemesanan"){
            pn_main.setVisible(false);
            pn_data.setVisible(false);
            pn_transaksi.setVisible(false);
            pn_pemesanan.setVisible(true);
            btn_kembali.setVisible(true);    
            lb_lapBar.setText("Laporan Pemesanan Barang");
        }else if(cbx_laporan.getSelectedItem()=="Laporan Transaksi Supplay"){
            pn_main.setVisible(false);
            pn_data.setVisible(false);
            pn_transaksi.setVisible(false);
            pn_pemesanan.setVisible(true);
            btn_kembali.setVisible(true);                   
            lb_lapBar.setText("Laporan Supplay Barang");      
            pn_tampil.revalidate();
        }
    }//GEN-LAST:event_cbx_laporanActionPerformed

    private void btn_print1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print1ActionPerformed
        pn_tampil.removeAll();
        servis.lapTransaksiPerBarang(pn_tampil, tf_kodeB.getText().toString());
    }//GEN-LAST:event_btn_print1ActionPerformed

    private void btn_pilihBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihBActionPerformed
        boolean closeable = true;
        data_barang tp = new data_barang(null,closeable);
        tp.setVisible(true);

        tf_kodeB.setText(tp.pel.getKode_barang());
        tf_namaB.setText(tp.pel.getNama_barang());
    }//GEN-LAST:event_btn_pilihBActionPerformed

    private void btn_print2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_print2ActionPerformed
        String date1 = tf_tglPes1.getText().toString();                                       
        String date2 = tf_tglPes2.getText().toString();
        pn_tampil.removeAll();
        if(lb_lapBar.getText() == "Laporan Pemesanan Barang"){
            servis.lapTransaksiPesanan(pn_tampil, date1, date2);
        } else {
            servis.lapTransaksiSupplay(pn_tampil, date1, date2);
        }
    }//GEN-LAST:event_btn_print2ActionPerformed

    private void btn_pilihB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihB1ActionPerformed
        dateChooser.showPopup();
    }//GEN-LAST:event_btn_pilihB1ActionPerformed

    private void btn_pilihB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihB2ActionPerformed
        dateChooser1.showPopup();
    }//GEN-LAST:event_btn_pilihB2ActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        reset();
    }//GEN-LAST:event_btn_kembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_kembali;
    private javax.swing.JButton btn_pilihB;
    private javax.swing.JButton btn_pilihB1;
    private javax.swing.JButton btn_pilihB2;
    private rojerusan.RSMaterialButtonRectangle btn_print;
    private rojerusan.RSMaterialButtonRectangle btn_print1;
    private rojerusan.RSMaterialButtonRectangle btn_print2;
    private rojerusan.RSComboMetro cbx_laporan;
    private com.raven.datechooser.DateChooser dateChooser;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_lapBar;
    private javax.swing.JPanel main;
    private javax.swing.JPanel pn_data;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_pemesanan;
    private javax.swing.JPanel pn_pilih;
    private javax.swing.JPanel pn_tampil;
    private javax.swing.JPanel pn_transaksi;
    private javax.swing.JPanel tampilData;
    private javax.swing.JTextField tf_kodeB;
    private javax.swing.JTextField tf_namaB;
    private javax.swing.JTextField tf_tglPes1;
    private javax.swing.JTextField tf_tglPes2;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        pn_main.setVisible(true);
        pn_data.setVisible(false);
        pn_transaksi.setVisible(false);
        pn_pemesanan.setVisible(false);
        btn_kembali.setVisible(false);
        cbx_laporan.setSelectedIndex(0);
        pn_tampil.removeAll();
        pn_tampil.revalidate();
    }
}
