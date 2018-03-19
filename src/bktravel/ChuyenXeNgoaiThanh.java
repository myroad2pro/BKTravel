/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bktravel;

import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class ChuyenXeNgoaiThanh extends ChuyenXe{
    protected String noiDen;
    protected int soNgay;
    
    // setters
    public void setNoiDen(String diaDiem){
        this.noiDen = diaDiem;
    }
    
    public void setSoNgay(int soNgay){
        this.soNgay = soNgay;
    }
    
    // getters 
    public String getNoiDen(){
        return noiDen;
    }
    
    public int getSoNgay(){
        return soNgay;
    }
    
    // constructors
    public ChuyenXeNgoaiThanh(){
        super();
        this.setNoiDen("");
        this.setSoNgay(0);
    }
    
    public ChuyenXeNgoaiThanh(String id, String name, String num, double income, String diaDiem, int soNgay){
        super(id, name, num, income);
        this.setNoiDen(diaDiem);
        this.setSoNgay(soNgay);
    }
    // methods

    /**
     *
     */
    public void nhapChuyenXeNgoaiThanh(){
        super.nhapChuyenXe();
        this.setNoiDen(JOptionPane.showInputDialog("Nhap Noi Den: "));
        this.setSoNgay(Integer.parseInt(JOptionPane.showInputDialog("Nhap So Ngay Di Duoc: ")));
    }
    
    public String showInfo(){
        return "ID: " + this.getChuyenID() + "\nSo xe: " + this.getSoXe()
        + "\nTen Tai Xe: " + this.getTenTaiXe() + "\nNoi Den: " + this.getNoiDen()+ "\nSo Ngay Di Duoc: " + this.getSoNgay()+ "\nDoanh Thu: " + this.getDoanhThu();
    }
}
