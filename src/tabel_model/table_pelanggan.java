/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_pelanggan;

/**
 *
 * @author fatiq
 */
public class table_pelanggan extends AbstractTableModel{

    private List<model_pelanggan> list = new ArrayList<>();
    
    public void tambahData (model_pelanggan mod){
        list.add(mod);
        fireTableRowsInserted(list.size()-1, list.size()-1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void perbaruiData (model_pelanggan mod){
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
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
    
    public void setData(List<model_pelanggan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_pelanggan mod){
        list.set(index, mod);
        fireTableRowsUpdated(index, index);
    }
    
    public model_pelanggan getData (int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] numName = {"NO", "ID Pelanggan", "Nama Pelanggan", "NO. TLP", "Alamat"};
    
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
                case 0 : return list.get(rowIndex).getId_pelanggan();
                case 1 : return list.get(rowIndex).getNama_pelanggan();
                case 2 : return list.get(rowIndex).getTlp_pelanggan();
                case 3 : return list.get(rowIndex).getAlamat_pelanggan();
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
