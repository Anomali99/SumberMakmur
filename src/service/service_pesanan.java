/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pesanan;

/**
 *
 * @author fatiq
 */
public interface service_pesanan {
    void tambahData(model_pesanan modPes);
    
    model_pesanan getByID(String id);
    List<model_pesanan> ambilData();
    List<model_pesanan> pencarianData(String id);
    String nomor();
}
