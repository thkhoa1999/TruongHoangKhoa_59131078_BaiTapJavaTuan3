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
public class Main1 
{
    public static void main(String[] args) 
    {
        context Cong = new context();
        context Tru = new context();
        context Nhan = new context();
        context Chia = new context();
        
        Cong.setTinhToan(new Cong());
        System.out.println(Cong.tinh(75, 12));
        
        Tru.setTinhToan(new Tru());
        System.out.println(Tru.tinh(54, 78));
        

    }
    
}