/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odd.and.even;

/**
 *
 * @author cc2_1d-6
 */
public class ODDANDEVEN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int a[]={21,23,15,9,3,20,18,4,2,14};  
    System.out.println("Elements of Arrays:\n"+"3,9,15,23,21,20,18,4,2,14");
    System.out.print("Odd Numbers\t"+ "Even Numbers:");  
for(int i=0;i<a.length;i++){  
if(a[i]%2!=0){  
    System.out.println(a[i]+"\t");  
}  
else if(a[i]%2==0){  
System.out.println("\t"+"\t"+a[i]);
}  
}  
}
}
    
    

