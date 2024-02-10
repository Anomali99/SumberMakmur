/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class model_pesanan {
    private String no_pesan;
    private String tanggal;
    private model_pelanggan id_pel;
    private model_penjual id_Pen;
    private Long total;

    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public model_pelanggan getId_pel() {
        return id_pel;
    }

    public void setId_pel(model_pelanggan id_pel) {
        this.id_pel = id_pel;
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
