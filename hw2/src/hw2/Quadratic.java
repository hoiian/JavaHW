package hw2;
import java.util.Scanner;
import java.text.*;

public class Quadratic {
private static Scanner scan;

	public static void main(String[] args){
		
		double a=0, b=0, c=0;
		double x1, x2;
		double delta;
		String fo;
		scan = new Scanner(System.in);
	
		System.out.println("Enter a,b,c,format:");
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		fo = scan.next();
		DecimalFormat pattern = new DecimalFormat(fo);
		
		delta = (b*b) - (4*a*c) ;
		if(delta >=0 ){
			x1 = (-1*b + Math.sqrt(delta))/(2*a);
			x2 = (-1*b - Math.sqrt(delta))/(2*a);
				
			if(a!=0)
				System.out.println(pattern.format(x1)+"\n"+pattern.format(x2));
			else
				System.out.println("there are only one root:" + pattern.format(-c/b));

		
		}
		else System.out.println("Do not have the real numbers root.");
	

	}
}
