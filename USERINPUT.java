/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.input;

import java.util.Scanner;

/**
 *
 * @author cc2_1d-6
 */
public class USERINPUT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner asd = new Scanner (System.in);
        System.out.println("Enter How Many Rows:");
       int rows = asd.nextInt();
        System.out.println("Enter How Many Columns:");
       int columns = asd.nextInt();
       int k[][] = new int [rows][columns];
        for (int a=0;a<k.length;a++){
            for (int b=0;b<k[a].length;b++){
            
                System.out.println("Enter The Number For Row "+a+"Enter The Number For Column "+b);
                
                int qwe = asd.nextInt();
                k[a][b] = qwe;
            }
        }
        for (int c=0;c<k.length;c++){
            for (int d=0;d<k[c].length;d++){
                System.out.println("OUTPUT:");
                System.out.println("Row "+c+ " Columns "+d+" : " +k[c] [d]);  
    }
    
}
    }
}

