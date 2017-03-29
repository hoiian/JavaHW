package hw4;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Babylonia {
	private static Scanner scan;

	public static void main(String[] args){
		scan = new Scanner(System.in);
		long n = 0;
		double guess=0.0, lastguess=0.0;
		DecimalFormat pattern = new DecimalFormat("#.##");
		
//		System.out.print("number = ");
		n = scan.nextLong();
		
		guess = n/2;
		do{
			lastguess = guess;
			guess = (guess + (n/guess) ) / 2;
		}while( (guess<lastguess*0.99) || (guess>lastguess*1.01) );

//		System.out.println(guess);
		System.out.println(pattern.format(guess));
//		System.out.println();
//		a = Math.sqrt(n);
//		System.out.printf("%.1f",a);
	}

}