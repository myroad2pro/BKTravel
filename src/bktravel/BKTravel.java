/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bktravel;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hoanganh
 */
public class BKTravel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        QuanLyChuyenXe dscx = new QuanLyChuyenXe();
        do{
            choice = Integer.parseInt(JOptionPane.showInputDialog(null, "--------------------/------/-----------------------"+
                    "\n0. Exit" + "\n1. Them Chuyen Xe Noi Thanh" + "\n2. Them Chuyen Xe Ngoai Thanh" 
                    + "\n3. Hien Thi Danh Sach Chuyen Xe"));
            switch(choice){
                case 0:
                    break;
                case 1:
                    dscx.nhapChuyenXe(0);
                    break;
                case 2:
                    dscx.nhapChuyenXe(1);
                    break;
                case 3:
                    dscx.showInfo();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Lua chon khong hop le!");
            }
        }while(choice != 0);
    }
    
}
