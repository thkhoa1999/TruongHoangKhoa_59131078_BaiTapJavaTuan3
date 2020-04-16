/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Admin
 */
public class Main1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        context phepCong = new context();
        context phepTru = new context();
        context phepNhan = new context();
        context phepChia = new context();
        
        phepCong.setTinhToan(new Cong());
        System.out.println(phepCong.tinh(75, 12));
        
        phepTru.setTinhToan(new Tru());
        System.out.println(phepTru.tinh(54, 78));
        

    }
    
}