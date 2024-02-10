/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabel_model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_detailSupplay;

/**
 *
 * @author RIGISEFA
 */
public class table_detailSupplay extends AbstractTableModel{

    private List<model_detailSupplay> list = new ArrayList<>();
    
    public void tambahData (model_detailSupplay mod){
    list.add(mod);
    fireTableRowsInserted(list.size()-1, list.size()-1);
    JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void perbaruiData (int row, model_detailSupplay mod){
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
    
    public void setData(List<model_detailSupplay> list){
    clear();
    this.list.addAll(list);
    fireTableDataChanged();
    }

    public void setData(int index, model_detailSupplay mod) {
    list.set(index, mod);
    fireTableRowsUpdated(index, index);
    }
    
    public model_detailSupplay getData (int index){
    return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    private final String[] numName = {"NO", "Kode Barang", "Nama Barang", "Jumlah", "Subtotal"};
    
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
                case 0 : return list.get(rowIndex).getKode_bar().getKode_barang();
                case 1 : return list.get(rowIndex).getKode_bar().getNama_barang();
                case 2 : return list.get(rowIndex).getJumlah();
                case 3 : return list.get(rowIndex).getSubtotal();
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
