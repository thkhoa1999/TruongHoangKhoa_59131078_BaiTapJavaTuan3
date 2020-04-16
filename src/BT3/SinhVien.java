/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien() {
    }

    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }
    
    public SinhVien(String hoTen, String DOB, float diemTB) throws ParseException{
        SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        this.hoTen = hoTen;
        this.ngaySinh = date.parse(DOB);
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    public void setNgaySinh(String ngaySinhL) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        this.ngaySinh = formatter.parse(ngaySinhL);
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    public String hienThiTT(){
        return " Tên sinh viên: " + hoTen + "\n" +
                "\tNgày sinh: " + ngaySinh + "\n" +
                "\t Điểm trung bình: " + diemTB;
    }
}