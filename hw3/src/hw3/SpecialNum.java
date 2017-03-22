package hw3;

import java.util.Scanner;

public class SpecialNum {
	private static Scanner scan;

	public static void main(String[] args){
			scan = new Scanner(System.in);
			Calculate cal = new Calculate();
			
			String input, x_string, y_string;
			int x=0, y=0;
			int k=1;

			System.out.println("Enter X=?? or Y=??:");
			input = scan.nextLine();
			
			if(input.startsWith("X")){
				x_string = input.substring(2);
				x = Integer.valueOf(x_string);
				
				if(cal.isTrue(x)){
					System.out.println("ture");
				}else System.out.println("flase");
				
			}
			
			if(input.startsWith("Y")){
				y_string = input.substring(2);
				y = Integer.valueOf(y_string);
				
				k = cal.getythnum(y);
				System.out.println(k);
			
			}
			
	}
}
