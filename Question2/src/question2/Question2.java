/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question2;

import java.util.*;

/**
 *
 * @author Student
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int lastDigit= number%10;
        while(number>10){
            number/=10;        
        }
        int firstDigit=number;
        System.out.println(firstDigit+lastDigit);
                
      
    }
    
}
