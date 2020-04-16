/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

/**
 *
 * @author Admin
 */
public class ThanhToanOnline implements IThanhToan{

    public ThanhToanOnline() {
    }

    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            return tienHang * 0.05;
        return tienHang * 0.07;
    }
    
}
