package hw6;
import java.util.Scanner;

public class Main {
private static Scanner scan;
	public static void main(String args[]) {
		scan = new Scanner(System.in);
		String num1 = scan.next();
		String op = scan.next();
		String num2 = scan.next();	
		String result = "0";
		IOperation add = new Addition();
		IOperation sub = new Subtraction();
		IOperation comp = new Comparison();
		
		switch(op){
		case "+": 
			result = add.perform(num1, num2); 
			break;
		
		case "-":
			result = sub.perform(num1, num2); 
			break;
		
		case ">":
			if(comp.perform(num1, num2) == "1")
				result = "true";
			else 
				result = "false";
			break;
		
		case "<":
			if(comp.perform(num1, num2) == "-1")
				result = "true";
			else 
				result = "false";
			break;
		
		case "=":
			if(comp.perform(num1, num2) == "0")
				result = "true";
			else 
				result = "false";
			break;
		}
		
		
//		System.out.println(num1);
//		System.out.println(op);
//		System.out.println(num2);
		System.out.println(result);
		
		
		
	}
}
