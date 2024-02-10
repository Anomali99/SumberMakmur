/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_barang;

/**
 *
 * @author fatiq
 */
public interface service_barang {
    void tambahData(model_barang modBar);
    void hapusData(model_barang modBar);
    void ubahData(model_barang modBar);
    
    model_barang getByID(String id);
    
    int ambilStok(String id);
    void ubahStok(int stok,String id);
    
    List<model_barang> ambilData();
    
    List<model_barang> pencarianData(String id);
    
    String nomor();
}
