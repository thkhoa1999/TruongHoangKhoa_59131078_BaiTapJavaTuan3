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
public class SoSanhTheoTen implements ISoSanh<SinhVien>{

    public SoSanhTheoTen() {
    }

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        String oName1 = o1.getHoTen();
        String oName2 = o2.getHoTen();
        String[] split1 = oName1.split(" ");
        String[] split2 = oName2.split(" ");
        
        int size1 = split1[split1.length - 1].length(); //Lay do dai chu cuoi cung
        int size2 = split2[split2.length - 1].length();
        
        String name1 = oName1.substring((oName1.length() - size1));
        String name2 = oName2.substring((oName2.length() - size2));
        
        int returnValue;   //compareTo: o1 > o2 -> returnValue > 0, o1 == o2 -> returnValue == 0
        if(name1.compareTo(name2) != 0)
            returnValue = name1.compareTo(name2);
        else
            returnValue = oName1.compareTo(oName2);
        
        if(returnValue > 0)
            return 1;
        else if(returnValue < 0)
            return -1;
        else
            return 0;
    }
    
}