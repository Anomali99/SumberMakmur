/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_penjual;

/**
 *
 * @author fatiq
 */
public interface service_penjual {
    void tambahData(model_penjual modPen);
    void hapusData(model_penjual modPen);
    void ubahDataA(model_penjual modPen);
    void ubahData(model_penjual modPen);
    void ubahPassword(model_penjual modPen);
    void ubahFoto(model_penjual modPen);
    
    model_penjual getByID(String id);
    
    List<model_penjual> ambilData();
    
    List<model_penjual> pencarianData(String id);
    
    String nomor();
}
