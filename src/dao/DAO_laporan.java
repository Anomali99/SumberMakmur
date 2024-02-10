/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static config.koneksi.getConnection;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import service.service_laporan;
import view.transaksi_supplay;

/**
 *
 * @author fatiq
 */
public class DAO_laporan implements service_laporan{

    @Override
    public void lapTranPes(String no) {
        try{
            String reportPath = "src/report/pesanan.jasper";
            Connection conn = getConnection();

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no",no);

            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            JasperViewer viewer = new JasperViewer(print,false);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapTranSup(String no) {
        try{
            String reportPath = "src/report/supplay.jasper";
            Connection conn = getConnection();
                
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no",no);
                
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            JasperViewer viewer = new JasperViewer(print,false);
            viewer.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapDataBarang(JPanel jp) {
        try{
            String reportPath = "src/report/lapDataBar.jasper";
            Connection conn = getConnection();

            HashMap<String, Object> parameters = new HashMap<>();

            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapTransaksiPerBarang(JPanel jp, String kode) {
        try{
            String reportPath = "src/report/lapPerBar.jasper";
            Connection conn = getConnection();
                
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("kode",kode);
                
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapTransaksiPesanan(JPanel jp, String date1, String date2) {
        try{
            String reportPath = "src/report/lapPesBar.jasper";
            Connection conn = getConnection();
                
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("date3",date1);
            parameters.put("date4",date2);
                
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapTransaksiSupplay(JPanel jp, String date1, String date2) {
        try{ 
            String reportPath = "src/report/lapSupBar.jasper";
            Connection conn = getConnection();
                
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("date3",date1);
            parameters.put("date4",date2);
                
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapTransaksiPenjual(JPanel jp, String date1, String date2) {
        try{ 
            String reportPath = "src/report/lapTranPen1.jasper";
            Connection conn = getConnection();
                
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("date1",date1);
            parameters.put("date2",date2);
                
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void lapTransaksiPerPenjual(JPanel jp, String id) {
        try{
            String reportPath = "src/report/lapTranPen.jasper";
            Connection conn = getConnection();
                
            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("id",id);
                
            JasperPrint print = JasperFillManager.fillReport(reportPath,parameters,conn);
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (JRException ex) {
            Logger.getLogger(transaksi_supplay.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
