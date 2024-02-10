/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Blob;

/**
 *
 * @author fatiq
 */
public class model_penjual {
    private String id_penjual;
    private String username;
    private String password;
    private String nama_penjual;
    private String alamat_penjual;
    private String tlp_penjual;
    private String imgPath;
    private Blob gambar;
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getId_penjual() {
        return id_penjual;
    }

    public void setId_penjual(String id_penjual) {
        this.id_penjual = id_penjual;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama_penjual() {
        return nama_penjual;
    }

    public void setNama_penjual(String nama_penjual) {
        this.nama_penjual = nama_penjual;
    }

    public String getAlamat_penjual() {
        return alamat_penjual;
    }

    public void setAlamat_penjual(String alamat_penjual) {
        this.alamat_penjual = alamat_penjual;
    }

    public String getTlp_penjual() {
        return tlp_penjual;
    }

    public void setTlp_penjual(String tlp_penjual) {
        this.tlp_penjual = tlp_penjual;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Blob getGambar() {
        return gambar;
    }

    public void setGambar(Blob gambar) {
        this.gambar = gambar;
    }
    
}
