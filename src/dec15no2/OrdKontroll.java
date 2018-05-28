/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec15no2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Björn
 */
public class OrdKontroll {
    private static ArrayList<Ord> orden = new ArrayList<>();

    public ArrayList<Ord> getOrden() {
        return orden;
    }

    public void addToOrden(Ord ordet) {
        boolean Dublett = false;
        for (Ord ord : orden){
            if (ordet.getOrdet().equals(ord.getOrdet())){
                Dublett = true;
                System.out.println("Dublett detekterad!");
                
            }
            
        }
        if (!Dublett)    {
            orden.add(ordet);
            System.out.println("Ett ord adderat: "+ordet.getOrdet());
            
        }
        else {
            System.out.println("Dublett");      
        }
        
    }
    
    public void removeFromOrden(String ordet){
        Iterator radord = orden.iterator();
        while (radord.hasNext()){
            Ord raderaOrd = (Ord)radord.next();
            if (ordet.equals(raderaOrd.getOrdet())){
                radord.remove();
            }   
        }
        
    }
    
    public void printOrden(){
        for (Ord ord: orden){
            System.out.println(ord.getOrdet());
        }
    }
    
}
