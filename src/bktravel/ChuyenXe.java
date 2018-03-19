/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bktravel;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hoanganh
 */
public class ChuyenXe {
    protected String chuyenID, tenTaiXe, soXe;
    protected double doanhThu;
    // constructor
    public ChuyenXe(){
        this.chuyenID = "";
        this.tenTaiXe = "";
        this.soXe = "";
        this.doanhThu = 0;
    }
    
    public ChuyenXe(String id, String name, String num, double income){
        this.chuyenID = id;
        this.tenTaiXe = name;
        this.soXe = num;
        this.doanhThu = income;
    }
    
    // setters
    public void setChuyenID(String id){
        this.chuyenID = id;
    }
    
    public void setTenTaiXe(String name){
        this.tenTaiXe = name;
    }
    
    public void setSoXe(String num){
        this.soXe = num;
    }
    
    public void setDoanhThu(double income){
        this.doanhThu = income;
    }
    //getters
    public String getChuyenID(){
        return this.chuyenID;
    }
    
    public String getTenTaiXe(){
        return this.tenTaiXe;
    }
    
    public String getSoXe(){
        return this.soXe;
    }
    
    public double getDoanhThu(){
        return this.doanhThu;
    }
    
    // methods
    public void nhapChuyenXe(){
        this.setChuyenID(JOptionPane.showInputDialog(null, "Nhap ma so chuyen xe: "));
        this.setSoXe(JOptionPane.showInputDialog(null, "Nhap so xe: "));
        this.setTenTaiXe(JOptionPane.showInputDialog(null, "Nhap ten tai xe: "));
        this.setDoanhThu(Double.parseDouble(JOptionPane.showInputDialog(null, "Nhap doanh thu: ")));
    }
    
    public String showInfo(){
        return "ID: " + this.getChuyenID() + "\nSo xe: " + this.getSoXe()
        + "\nTen Tai Xe: " + this.getTenTaiXe() + "\nDoanh Thu: " + this.getDoanhThu();
    }
}
