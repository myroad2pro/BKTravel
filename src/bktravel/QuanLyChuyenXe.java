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
public class QuanLyChuyenXe {
    private ChuyenXe[] danhSach = new ChuyenXe[100];
    private int countChuyenXe = 0;
    private double sum1 = 0, sum2 = 0;
    // method
    public void nhapChuyenXe(int mode){// mode 0: xe noi thanh, mode 1: xe ngoai thanh
        if(countChuyenXe > 100){
            JOptionPane.showMessageDialog(null, "So luong xe da day. Khong the them du lieu", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            switch(mode){
                case 0:
                    danhSach[countChuyenXe] = new ChuyenXeNoiThanh();
                    ChuyenXeNoiThanh xeNT = new ChuyenXeNoiThanh();
                    xeNT.nhapChuyenXeNoiThanh();
                    danhSach[countChuyenXe++] = xeNT;
                    sum1 += xeNT.getDoanhThu();
                    break;
                case 1:
                    danhSach[countChuyenXe] = new ChuyenXeNgoaiThanh();
                    ChuyenXeNgoaiThanh xeNgT = new ChuyenXeNgoaiThanh();
                    xeNgT.nhapChuyenXeNgoaiThanh();
                    danhSach[countChuyenXe++] = xeNgT;
                    sum2 += xeNgT.getDoanhThu();
                    break;
                default:
                    break;
            }
        }
    }
    
    public void showInfo(){
        for(ChuyenXe xe: danhSach){
            if(xe != null){
                System.out.println("--------------------/------/-----------------------");
                System.out.println(xe.showInfo());
            }
        }
        System.out.println("--------------------/------/-----------------------");
        System.out.println("-------------------Doanh Thu-----------------------");
        System.out.println("Xe Noi Thanh:\t\t" + sum1);
        System.out.println("Xe Ngoai Thanh:\t\t" + sum2);
        System.out.println("--------------------/------/-----------------------");
    }
}
