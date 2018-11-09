/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author cc2_1d-6
 */
public class CALCULATOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner Calc = new Scanner(System.in);
    String x;
    int num1;
    int num2;
    
        System.out.println("Choose your Operator: (Addition +, Subtraction -, Multiplication *, Division % )");
        x = Calc.next();
       
        
            
              
                System.out.println("Enter First Number: ");
                num1 = Calc.nextInt();
                System.out.println("Enter Second Number: ");
                num2 = Calc.nextInt();
        
        System.out.println("The Answer is: ");
            
            switch (x){
                case ("Addition"):
                    System.out.println("sum:" +(num1+num2));
                break;
                case ("+"):
                    System.out.println("sum: " +(num1+num2));
                break;
                case ("Subtraction"):
                    System.out.println("difference: " + (num1-num2));
                    break;
                case ("-"):
                    System.out.println("difference: " + (num1-num2));
                break;
                case ("Multiplication"):
                    System.out.println("product: " + (num1*num2));
                    break;
                case ("*"):
                    System.out.println("product: " + (num1*num2));
                break;
                case ("Division"):
                    System.out.println("qoutient: " + (num1%num2));
                    break;
                case ("%"):
                    System.out.println("qoutient: " + (num1%num2));
                break;
    }
    
}
}
