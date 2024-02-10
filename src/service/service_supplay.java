/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_pesanan;
import model.model_supplay;

/**
 *
 * @author fatiq
 */
public interface service_supplay {
    void tambahData(model_supplay modSup);
    
    model_supplay getByID(String id);
    List<model_supplay> ambilData();
    List<model_supplay> pencarianData(String id);
    String nomor();
}
