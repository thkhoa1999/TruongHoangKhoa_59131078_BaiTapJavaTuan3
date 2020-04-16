/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class QLSV {
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> dsSV;

    public QLSV() {
        dsSV = new ArrayList<>();
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }
    
    public void them(SinhVien sv){
        dsSV.add(sv);
    }
    
    public void sapXep(){
        SinhVien k;
        int j;
        int size = dsSV.size();
        for (int i = 0; i < size; i++) {
            k = dsSV.get(i);
            j = i - 1;
            
            while (j >= 0 && soSanh.soSanh(dsSV.get(j), dsSV.get(i)) == 1){
                dsSV.set(j + 1, dsSV.get(j));
                j -= 1;
            }
            dsSV.set(j + 1, k);
        }
    }
    
    public void inDS(){
        int size = dsSV.size();
        for (int i = 0; i < size; i++) {
            System.out.println(dsSV.get(i).hienThiTT());
        }
    }
}