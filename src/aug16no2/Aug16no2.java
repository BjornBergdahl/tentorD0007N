/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug16no2;

/**
 *
 * @author Björn
 */
public class Aug16no2 {
    static int[] frequence = new int[7];
    
    public static void main(String[] args) {
        frequence = assignFrequence();
        printFrequence(frequence);
    }
    
    public static int[] assignFrequence()  {
        int[] frekvens = {0,0,0,0,0,0,0};
        for (int i=0; i<100; i++)   {
            int x;
            x = (int) (Math.random()*6+1);
            frekvens[x]=frekvens[x]+1;
        }
        
        return frekvens;
    }
    
    public static void printFrequence(int[] frekvens){
        System.out.println("Tärningsfrekvensen med hundra slag!");
        for (int i= 1; i<7; i++)    {
            System.out.println("Antal "+(i)+":or: "+(frekvens[i]));
        }
    }
    
}
