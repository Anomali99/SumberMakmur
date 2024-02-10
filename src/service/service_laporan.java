/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import javax.swing.JPanel;

/**
 *
 * @author fatiq
 */
public interface service_laporan {
    void lapTranPes (String no);
    void lapTranSup (String no);
    
    void lapDataBarang (JPanel jp);
    void lapTransaksiPerBarang (JPanel jp, String kode);
    void lapTransaksiPesanan (JPanel jp, String date1, String date2);
    void lapTransaksiSupplay (JPanel jp, String date1, String date2);
    
    void lapTransaksiPenjual (JPanel jp, String date1, String date2);
    void lapTransaksiPerPenjual (JPanel jp, String id);
}
