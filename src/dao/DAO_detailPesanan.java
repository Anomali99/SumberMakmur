/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import model.model_barang;
import model.model_detailPesanan;
import service.service_detailPesanan;

/**
 *
 * @author fatiq
 */
public class DAO_detailPesanan implements service_detailPesanan{

    private Connection conn;
    
    public DAO_detailPesanan(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(List<model_detailPesanan> list) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_pesanan (kode_barang,id_penjual,id_pelanggan,no_pesanan,jumlah_pesanan,sub_total) VALUE ";
        try{
            for(int i = 0; i < list.size(); i++){
                String x = "('"+list.get(i).getKode_bar().getKode_barang()+"', '"
                        +list.get(i).getId_Pen().getId_penjual()+"', '"
                        +list.get(i).getId_pel().getId_pelanggan()+"', '"
                        +list.get(i).getNo_pes().getNo_pesan()+"', "
                        +list.get(i).getJumlah()+", "
                        +list.get(i).getSubtotal()+")";
                if(i != list.size()-1){
                    x = x + ", ";
                } 
                
                sql = (sql + x).toString();
            }
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_detailPesanan> getByID(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM detail_pesanan p "
                +"INNER JOIN barang b ON p.kode_barang = b.kode_barang "
                +"WHERE p.no_pesanan = '"+id+"' ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_detailPesanan pes = new model_detailPesanan();
                model_barang bar = new model_barang();
                
                bar.setKode_barang(rs.getString("kode_barang"));
                bar.setNama_barang(rs.getString("nama_barang"));
                pes.setJumlah(rs.getInt("jumlah_pesanan"));
                pes.setSubtotal(rs.getLong("sub_total"));
                pes.setKode_bar(bar);
               
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_detailPesanan> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM detail_pesanan p "
                +"INNER JOIN barang b ON p.kode_barang = b.kode_barang ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_detailPesanan pes = new model_detailPesanan();
                model_barang bar = new model_barang();
                
                bar.setKode_barang(rs.getString("kode_barang"));
                bar.setNama_barang(rs.getString("nama_barang"));
                pes.setJumlah(rs.getInt("jumlah"));
                pes.setSubtotal(rs.getLong("sub_total"));
                pes.setKode_bar(bar);
               
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailPesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
}
