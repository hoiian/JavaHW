package hw4;
import java.util.Scanner;
import java.lang.*;

public class Babylonia {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		long n = 0;
		double guess=0.0, lastguess=0.0,a;
		System.out.print("number = ");
		n = scan.nextLong();
		
		guess = n/2;
		do{
			lastguess = guess;
			guess = (guess + (n/guess) ) / 2;
		}while( (guess<lastguess*0.99) || (guess>lastguess*1.01) );

		System.out.println(guess);		
		System.out.printf("%.1f",guess);
		System.out.println();
		a = Math.sqrt(n);
		System.out.printf("%.1f",a);
	}

}
