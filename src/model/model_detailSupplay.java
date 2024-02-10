/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fatiq
 */
public class model_detailSupplay {
    private model_supplay no_sup;
    private model_barang kode_bar;
    private model_supplayer id_sup;
    private model_penjual id_Pen;
    private Long subtotal;
    private Integer jumlah;

    public model_supplay getNo_sup() {
        return no_sup;
    }

    public void setNo_sup(model_supplay no_sup) {
        this.no_sup = no_sup;
    }

    public model_barang getKode_bar() {
        return kode_bar;
    }

    public void setKode_bar(model_barang kode_bar) {
        this.kode_bar = kode_bar;
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
