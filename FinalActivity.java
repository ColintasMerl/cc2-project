/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.activity;

import java.util.Scanner;

/**
 *
 * @author cc2_1d-6
 */
public class FinalActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner asd= new Scanner(System.in);
       boolean s = true;
       String b = null;
       String q;
     
       while(s==true){
            System.out.println("What do you want to use?:"+("Fibonacci or Factorial"));
         b=asd.next();
       s=false;
       } 
       if(b.equalsIgnoreCase("Factorial")){
           Factor();
       }
       else if (b.equalsIgnoreCase("Fibonacci")){
           Fibo2();
       }
       else{
           System.out.println("Error! Follow Instructions!!");
       }
    }
     public static int Array(){
         Scanner d= new Scanner(System.in);
         System.out.println("Please Enter the Size of your Array:");  
         int x =d.nextInt();
         return x;
     }  
     public static int Fact(int n){
         if (n == 0)    
            return 1;    
        else    
        return(n * Fact(n-1));  
    }
     public static int Fibo(int n){
         if(n==0)
            return 0;
        else if(n<=2)
            return 1;
        int x = Fibo(n-1)+ Fibo(n-2);
        return x;       
    }
    static void Factor(){
        Scanner d=new Scanner (System.in);
        int w = Array();
        int [] arr = new int [w];
        int r;
        System.out.println("Please Enter The Elements:");
        for(int x=0;x<w;x++){
            arr[x]=d.nextInt();
        }
        for(int z=0;z<arr.length;z++){
            System.out.print("F("+arr[z]+")\t");
        }
        System.out.println("\n");
        System.out.println("\nThe Factorial is:");
        
        for(int g=0;g<arr.length;g++){
            r=Fact(arr[g]);
            
            System.out.print(r+"\t");
        }
    }
    static void Fibo2(){
        Scanner d = new Scanner(System.in);
        int w = Array();
        int [] arr=new int[w];
        int c;
        System.out.println("Please Enter The Elements:");
        for (int x=0;x<w;x++){
            arr[x]=d.nextInt();
        }System.out.println("The Fibonacci is:");
        for(int z=0;z<arr.length;z++){
            System.out.print("F("+arr[z]+")\t");
        }
        System.out.println("\n");
        for(int g=0;g<arr.length;g++){
            c=Fibo(arr[g]);
            System.out.print(c+"\t");
        }
    }
}

    
    

