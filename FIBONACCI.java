/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author cc2_1d-6
 */
public class FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner asd= new Scanner(System.in);
        System.out.println("Enter:");
        int n=asd.nextInt();
        for(int i=0;i<=n;i++){
            System.out.print("F("+i+")\t");
        }
        System.out.println("\n");
        for(int j=1;j<= n;j++){
            System.out.print("0\t");
            for(int l=1;l<=j;l++){
              System.out.print(asd(j)+"\t");  
            }
            System.out.println("\n");
        }
        
    }
    public static int qwe(int n){
        if (n == 1 || n == 2){
            return 1;
             
    }
        return qwe(n-1) + qwe(n-2);
    }


    public static int asd(int n){
        if (n==1|| n ==2){
            return 1;
        }
        int  s =1,u=1,qwe=1;
        for( int i=3;i<=n;i++){
            qwe=s+u;
            s=u;
            u=qwe;
        }
        return qwe;
    }    
    }
    

