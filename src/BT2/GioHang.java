/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class GioHang {
    private IThanhToan hinhThucTT;
    ArrayList<HangHoa> dsHH;

    public GioHang() {
        dsHH = new ArrayList<>();
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }
    
    public double thanhToan(int tienHang){
        return hinhThucTT.thanhToan(tienHang);
    }
    
    public int tongTienHang(){
        int s = 0;
        int size = dsHH.size();
        for(int i = 0; i < size; i++){
            s += dsHH.get(i).getGia();
        }
        return s;
    }
    
    public void them(HangHoa h){
        dsHH.add(h);
    }
    
    public void inDS(){
        int size = dsHH.size();
        for (int i = 0; i < size; i++) {
            System.out.println(dsHH.get(i).hienThiTT());
        }
    }
}