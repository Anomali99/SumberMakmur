/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabel_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_pesanan;

/**
 *
 * @author RIGISEFA
 */
public class table_pesanan extends AbstractTableModel{

    private List<model_pesanan> list = new ArrayList<>();
    
    public void tambahData (model_pesanan mod){
    list.add(mod);
    fireTableRowsInserted(list.size()-1, list.size()-1);
    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void perbaruiData (int row, model_pesanan mod){
    list.add(row, mod);
    fireTableDataChanged();
    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void hapusData (int index){
    list.remove(index);
    fireTableRowsDeleted(index, index);
    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void clear (){
    list.clear();
    fireTableDataChanged();
    }
    
    public void setData(List<model_pesanan> list){
    clear();
    this.list.addAll(list);
    fireTableDataChanged();
    }

    public void setData(int index, model_pesanan mod) {
    list.set(index, mod);
    fireTableRowsUpdated(index, index);
    }
    
    public model_pesanan getData (int index){
    return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] numName = {"NO", "NO Pemesanan", "TGL Pemesanan", "ID Penjual", "Nama Penjual", "ID Pelanggan", "Nama Pelanggan", "Total"};
    
    @Override
    public int getColumnCount() {
        return numName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0){
            return "   "+ (rowIndex +1);
        } else {
            switch (columnIndex-1){
                case 0 : return list.get(rowIndex).getNo_pesan();
                case 1 : return list.get(rowIndex).getTanggal();
                case 2 : return list.get(rowIndex).getId_Pen().getId_penjual();
                case 3 : return list.get(rowIndex).getId_Pen().getNama_penjual();
                case 4 : return list.get(rowIndex).getId_pel().getId_pelanggan();
                case 5 : return list.get(rowIndex).getId_pel().getNama_pelanggan();
                case 6 : return list.get(rowIndex).getTotal();
                default : return null;
            }
        }
    }
    
    @Override
    public String getColumnName(int column){
        if (column == 0){
            return "   "+numName[column];
        } else {
            return numName[column];
        }
    }
    
}
