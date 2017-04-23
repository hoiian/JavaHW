package hw6;

public class Comparison implements IOperation{
	
	public String perform(String num1, String num2) {

//		String num1 = "1131111111111111110111111111111111111112";
//		String num2 = "1141111111111111111111111111111111111111";
		int len1 = num1.length();
		int len2 = num2.length();
		int i=0;
		String result = "";
		
		if(len1<len2){
			result = "-1";
		}else if(len1>len2){
			result = "1";
		}else if(num1.equals(num2)){
			result = "0";
		}else{  //len1==len2
			for(i=0;i<len1;i++){
				if(num1.charAt(i) > num2.charAt(i)) {result = "1"; break;}
				else if(num1.charAt(i) < num2.charAt(i)) {result = "-1"; break;}
			}
		}
		
		System.out.println(result);
		
		return result;
	}

}
