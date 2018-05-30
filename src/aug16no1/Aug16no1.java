/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aug16no1;

import java.util.Scanner;

/**
 *
 * @author Björn
 */
public class Aug16no1 {





    static int numberOfNumbers;
    static int[] talen = new int[numberOfNumbers];
    
    public static void main(String[] args){
        numberOfNumbers = inputSize();
        talen = inputNumbers();
        printNumbers();
    }
    
    private static int inputSize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ange antal siffror att mata in: ");
        int inSize = input.nextInt();
        return inSize;
    }
        
    private static int[] inputNumbers() {
        
        int[] temp = new int[numberOfNumbers];
        Scanner input = new Scanner(System.in);
        for (int i=0; i < numberOfNumbers; i++){   
            System.out.println("Ange dina siffror ("+(numberOfNumbers-i)+" kvar): ");
            temp[i]= input.nextInt();
        }
        return temp;   
    }
    
    private static void printNumbers() {
        System.out.println("Talserien baklänges");
        for (int i = (numberOfNumbers-1); i>=0 ; i-- )  {
            System.out.println(talen[i]);
        }
    }

}
