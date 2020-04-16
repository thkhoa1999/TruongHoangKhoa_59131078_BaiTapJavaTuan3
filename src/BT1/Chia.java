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
public class Chia implements ITinh{

    public Chia() {
    }

    @Override
    public float tinh(float a, float b) {
        if(b != 0)
            return a / b;
        return Float.NaN;
    }
    
}