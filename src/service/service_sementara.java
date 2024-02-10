/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_sementara;

/**
 *
 * @author fatiq
 */
public interface service_sementara {
    void tambahData(model_sementara mod);
    void ubahData(model_sementara mod);
    void hapusData(model_sementara mod);
    void hapusAll();
    
    List<model_sementara> ambilData();
}
