/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class model_detailPesanan {
    private model_pesanan no_pes;
    private model_barang kode_bar;
    private model_pelanggan id_pel;
    private model_penjual id_Pen;
    private Long subtotal;
    private Integer jumlah;

    public model_pesanan getNo_pes() {
        return no_pes;
    }

    public void setNo_pes(model_pesanan no_pes) {
        this.no_pes = no_pes;
    }

    public model_barang getKode_bar() {
        return kode_bar;
    }

    public void setKode_bar(model_barang kode_bar) {
        this.kode_bar = kode_bar;
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

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }
    
}
