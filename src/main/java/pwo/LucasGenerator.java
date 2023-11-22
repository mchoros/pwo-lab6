package pwo;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class LucasGenerator {
 
    /**
     *
     * @param args
     */
    public static void main(String[] args) { 

     int a=2,b=1,c,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of lucas series:");
		int len=sc.nextInt();
		for(i=1;i<=len;i++){
		    c=a+b;
		    System.out.print(c+" ");
		    a=b;
		    b=c;
    }
 }

    LucasGenerator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getTerm(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
