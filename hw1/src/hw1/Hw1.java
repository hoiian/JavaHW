package hw1;

public class Hw1 {
	public static void main(String args[]) {
		for (String str : args) {

			if (str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o")
					|| str.startsWith("e")) {
				str = str.toUpperCase().charAt(0) + str.substring(1) + "ay";
			} else {
				str = str.toUpperCase().charAt(1) + str.substring(2) + str.charAt(0) + "ay";
			}

			System.out.println(str);

		}
	}
}
