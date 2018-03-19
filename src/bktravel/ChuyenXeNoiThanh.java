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
public class ChuyenXeNoiThanh extends ChuyenXe{
    protected String soTuyen;
    protected double soKmDiDuoc;
    
    // setters
    public void setSoTuyen(String soTuyen){
        this.soTuyen = soTuyen;
    }
    
    public void setSoKmDiDuoc(double soKm){
        this.soKmDiDuoc = soKm;
    }
    
    // getters
    public String getSoTuyen(){
        return this.soTuyen;
    }
    
    public double getSoKmDiDuoc(){
        return this.soKmDiDuoc;
    }
    
    // constructor
    public ChuyenXeNoiThanh(){
        super();
        this.soTuyen = "";
        this.soKmDiDuoc = 0;
    }
    
    public ChuyenXeNoiThanh(String id, String name, String num, double income, String soTuyen, double soKm){
        super(id, name, num, income);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKm;
    }
    
    // methods
    public void nhapChuyenXeNoiThanh(){
        super.nhapChuyenXe();
        this.setSoTuyen(JOptionPane.showInputDialog("Nhap So Tuyen: "));
        this.setSoKmDiDuoc(Double.parseDouble(JOptionPane.showInputDialog("Nhap So Km Di Duoc: ")));
    }
    
    public String showInfo(){
        return "ID: " + this.getChuyenID() + "\nSo xe: " + this.getSoXe()
        + "\nTen Tai Xe: " + this.getTenTaiXe() + "\nSo Tuyen: " + this.getSoTuyen() + "\nSo Km Di Duoc: " + this.getSoKmDiDuoc() + "\nDoanh Thu: " + this.getDoanhThu();
    }
}
