/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.ParseException;
/**
 *
 * @author Admin
 */
public class Main3 {

    public static void main(String[] args) throws ParseException
    {
        
        SinhVien SV1 = new SinhVien("Lê Văn A", "19-12-1999", (float)8.8);
        SinhVien SV2 = new SinhVien("Lê Văn B", "18-11-1999", (float)7.7);
        SinhVien SV3 = new SinhVien("Lê Văn C", "17-10-1999", (float)6.6);
        
        QLSV qlsv1 = new QLSV();
        qlsv1.setSoSanh((ISoSanh<SinhVien>) new SoSanhTheoDiem());
        qlsv1.them(SV1);
        qlsv1.them(SV2);
        qlsv1.them(SV3);
        qlsv1.sapXep();
        System.out.println("\n Danh sách sinh viên sắp xếp theo điểm: ");
        qlsv1.inDS();
        
        
        QLSV qlsv2 = new QLSV();
        qlsv2.setSoSanh((ISoSanh<SinhVien>) new SoSanhTheoTen());
        qlsv2.them(SV1);
        qlsv2.them(SV2);
        qlsv2.them(SV3);
        qlsv2.sapXep();
        System.out.println("\n Danh sách sinh viên sắp xếp theo tên: ");
        qlsv2.inDS();
        
    }
    
}