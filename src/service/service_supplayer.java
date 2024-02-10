/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_supplayer;

/**
 *
 * @author fatiq
 */
public interface service_supplayer {
    void tambahData(model_supplayer modSup);
    void hapusData(model_supplayer modSup);
    void ubahData(model_supplayer modSup);
    
    model_supplayer getByID(String id);
    
    List<model_supplayer> ambilData();
    
    List<model_supplayer> pencarianData(String id);
    
    String nomor();
}
