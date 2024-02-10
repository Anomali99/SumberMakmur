/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.model_detailSupplay;

/**
 *
 * @author fatiq
 */
public interface service_detailSupplay {
    void tambahData(List<model_detailSupplay> list);
    List<model_detailSupplay> getByID(String id);
    List<model_detailSupplay> ambilData();
}
