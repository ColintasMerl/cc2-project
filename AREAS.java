/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areas;
import java.util.Scanner;
/**
 *
 * @author cc2_1d-6
 */
public class AREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner asd = new Scanner(System.in);
    System.out.println("Enter Side of Square:");
    double square = asd.nextDouble();
    double area =   Math.pow(square,2);
    System.out.println("Area of square is:\t"+ area);
    
    System.out.println("Enter Base of Triangle: ");
    double base = asd.nextDouble();
    System.out.println("Enter Height of Triangle:");
    double height = asd.nextDouble();
    
                double areatriangle = 0.5*base*height;
                double ffff = Math.pow(Math.pow(base, 2) 
				+ Math.pow(height, 2),0.5);
    System.out.println("Area of Triangle is:"+ ffff );
    }
    }
    

