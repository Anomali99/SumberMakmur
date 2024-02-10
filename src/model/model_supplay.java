/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class model_supplay {
    private String no_supplay;
    private String tanggal;
    private model_supplayer id_sup;
    private model_penjual id_Pen;
    private Long total;

    public String getNo_supplay() {
        return no_supplay;
    }

    public void setNo_supplay(String no_supplay) {
        this.no_supplay = no_supplay;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public model_supplayer getId_sup() {
        return id_sup;
    }

    public void setId_sup(model_supplayer id_sup) {
        this.id_sup = id_sup;
    }

    public model_penjual getId_Pen() {
        return id_Pen;
    }

    public void setId_Pen(model_penjual id_Pen) {
        this.id_Pen = id_Pen;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
    
}
