/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author Admin
 */
public class SoSanhTheoDiem implements ISoSanh<SinhVien>{

    public SoSanhTheoDiem() {
    }

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        float d1 = o1.getDiemTB();
        float d2 = o2.getDiemTB();
        if(d1 < d2)
            return -1;
        else if(d1 > d2)
            return 1;
        else
            return 0;
    }
    
}