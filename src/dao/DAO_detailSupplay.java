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
import model.model_detailSupplay;
import service.service_detailSupplay;

/**
 *
 * @author fatiq
 */
public class DAO_detailSupplay implements service_detailSupplay{

    private Connection conn;
    
    public DAO_detailSupplay(){
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(List<model_detailSupplay> list) {
        PreparedStatement st = null;
        String sql = "INSERT INTO detail_supplay (kode_barang,id_penjual,id_supplayer,no_supplay,jumlah_supplay,sub_total) VALUE ";
        try{
            for(int i = 0; i < list.size(); i++){
                String x = "('"+list.get(i).getKode_bar().getKode_barang()+"', '"
                        +list.get(i).getId_Pen().getId_penjual()+"', '"
                        +list.get(i).getId_sup().getId_supplayer()+"', '"
                        +list.get(i).getNo_sup().getNo_supplay()+"', "
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
            java.util.logging.Logger.getLogger(DAO_detailSupplay.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailSupplay.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_detailSupplay> getByID(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM detail_supplay p "
                +"INNER JOIN barang b ON p.kode_barang = b.kode_barang "
                +"WHERE p.no_supplay = '"+id+"' ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_detailSupplay pes = new model_detailSupplay();
                model_barang bar = new model_barang();
                
                bar.setKode_barang(rs.getString("kode_barang"));
                bar.setNama_barang(rs.getString("nama_barang"));
                pes.setJumlah(rs.getInt("jumlah_supplay"));
                pes.setSubtotal(rs.getLong("sub_total"));
                pes.setKode_bar(bar);
               
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_detailSupplay.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailSupplay.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_detailSupplay> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM detail_supplay p "
                +"INNER JOIN barang b ON p.kode_barang = b.kode_barang ";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_detailSupplay pes = new model_detailSupplay();
                model_barang bar = new model_barang();
                
                bar.setKode_barang(rs.getString("kode_barang"));
                bar.setNama_barang(rs.getString("nama_barang"));
                pes.setJumlah(rs.getInt("jumlah_supplay"));
                pes.setSubtotal(rs.getLong("sub_total"));
                pes.setKode_bar(bar);
               
                list.add(pes);
            }
            return list;
        } catch (SQLException ex){
            java.util.logging.Logger.getLogger(DAO_detailSupplay.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } finally {
            if(st != null){
                try{
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(DAO_detailSupplay.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
    
}
