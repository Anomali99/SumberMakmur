/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_detailPesanan;

/**
 *
 * @author fatiq
 */
public interface service_detailPesanan {
    void tambahData(List<model_detailPesanan> list);
    List<model_detailPesanan> getByID(String id);
    List<model_detailPesanan> ambilData();
}
