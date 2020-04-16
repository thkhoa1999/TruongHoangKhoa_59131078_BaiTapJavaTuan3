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
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        HangHoa HH1 = new HangHoa("Máy bay đồ chơi", 900000, "JP");
        HangHoa HH2 = new HangHoa("Card đồ hoạ", 800000, "JP");
        HangHoa HH3 = new HangHoa("Chuột máy tính Logitech", 700000, "JP");
        
          //Thanh toán online
        GioHang GHO = new GioHang();
        GHO.setHinhThucTT(new ThanhToanOnline());
        GHO.them(HH1);
        GHO.them(HH2);
        GHO.them(HH3);
        GHO.inDS();
        System.out.println("Tổng số tiền thanh toáns: " + GHO.thanhToan(GHO.tongTienHang()) + "vnđ");
        
        System.out.println("**************************************************************************");
        
        
        
          //Thanh toán COD
        GioHang GHC = new GioHang();
        GHC.setHinhThucTT(new ThanhToanCOD());
        GHC.them(HH1);
        GHC.them(HH2);
        GHC.them(HH3);
        GHC.inDS();
        System.out.println("Tổng số tiền thanh toán: " + GHC.thanhToan(GHC.tongTienHang()) + "vnđ");
        
      
      
    }
    
}