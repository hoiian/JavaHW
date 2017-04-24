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
			if(num1.startsWith("-") && !num2.startsWith("-")){ //1: -a+b = b-a
				num1 = num1.substring(1);
				if(comp.perform(num1, num2) == "-1"){ //b-a
					result = sub.perform(num2, num1);
				}else {
					result = "-" + sub.perform(num1, num2);
				}
			}
			else if(!num1.startsWith("-") && num2.startsWith("-")){ //2: a+(-b) = a-b
				num2 = num2.substring(1);
				if(comp.perform(num1, num2) == "-1"){
					result = "-" + sub.perform(num2, num1);
				}else {
					result = sub.perform(num1, num2);
				}
			}
			else if(num1.startsWith("-") && num2.startsWith("-")){ //3: (-a)+(-b) = -(a+b) 
				num1 = num1.substring(1);
				num2 = num2.substring(1);
				result = "-" + add.perform(num1, num2);
			}
			else{ //4
				result = add.perform(num1, num2);
			}
			break;
		
		case "-":
			if(num1.startsWith("-") && !num2.startsWith("-")){ //1:(-a)-b = -(a+b)
				num1 = num1.substring(1);
				result = "-" + add.perform(num1, num2);
			}
			else if(!num1.startsWith("-") && num2.startsWith("-")){ //2: a+(-b) = a+b
				num2 = num2.substring(1);
				result = add.perform(num1, num2);
			}
			else if(num1.startsWith("-") && num2.startsWith("-")){ //3: (-a)-(-b) = b-a 
				num1 = num1.substring(1);
				num2 = num2.substring(1);
				if(comp.perform(num1, num2) == "-1"){ //b-a
					result = sub.perform(num2, num1);
				}else {
					result = "-" + sub.perform(num1, num2);
				}
			}
			else { //4: a-b
				if(comp.perform(num1, num2) == "-1"){
					result = "-" + sub.perform(num2, num1);
				}else {
					result = sub.perform(num1, num2);
				}
			}
			
			break;
		
		case ">":
			if(num1.startsWith("-") && !num2.startsWith("-")){ //1:(-)>(+) X
				result = "false";
			}
			else if(!num1.startsWith("-") && num2.startsWith("-")){ //2: (+)>(-) V
				result = "true";
			}
			else if(num1.startsWith("-") && num2.startsWith("-")){ //3: a<b ?
					if(comp.perform(num1, num2) == "-1")
						result = "true";
					else 
						result = "false";
			}
			else {
				if(comp.perform(num1, num2) == "1")
					result = "true";
				else 
					result = "false";
			}

			break;
		
		case "<":
			if(num1.startsWith("-") && !num2.startsWith("-")){ //1:(-)<(+) V
				result = "true";
			}
			else if(!num1.startsWith("-") && num2.startsWith("-")){ //2: (+)>(-) X
				result = "false";
			}
			else if(num1.startsWith("-") && num2.startsWith("-")){ //3: a>b ?
					if(comp.perform(num1, num2) == "1")
						result = "true";
					else 
						result = "false";
			}
			else {
				if(comp.perform(num1, num2) == "-1")
					result = "true";
				else 
					result = "false";
			}
			
			
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
