/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pelanggan;

/**
 *
 * @author fatiq
 */
public interface service_pelanggan {
    void tambahData(model_pelanggan modPel);
    void hapusData(model_pelanggan modPel);
    void ubahData(model_pelanggan modPel);
    
    model_pelanggan getByID(String id);
    
    List<model_pelanggan> ambilData();
    
    List<model_pelanggan> pencarianData(String id);
    
    String nomor();
}
