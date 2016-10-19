/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

/**
 *
 * @author leemartinc
 */
public class train {
    
    int length;
    int[] carriages;
    
    public train(int L, int[] values){
        
        length = L;
        carriages = values;
        
    }
    
    public int getLength(){
        return length;
    }
    
    
    public int[] getCarriages(){
        
        return carriages;
    }
    
    
    
}
