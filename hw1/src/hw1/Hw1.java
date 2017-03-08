package hw1;

public class Hw1 {
	public static void main(String args[]) {

		for (int i = 0; i < args.length; i++) {

			if (args[i].startsWith("a") || args[i].startsWith("e") || args[i].startsWith("i") || args[i].startsWith("o")
					|| args[i].startsWith("e")) {
				args[i] = args[i].toUpperCase().charAt(0) + args[i].substring(1) + "ay";
			} else {
				args[i] = args[i].toUpperCase().charAt(1) + args[i].substring(2) + args[i].charAt(0) + "ay";
			}

			System.out.print(args[i]);
			
			if(i != args.length -1 ) 
			{ System.out.print(" ");}
			
		}
	}
}
