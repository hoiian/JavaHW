package hw6;

public class Subtraction implements IOperation{
	

		public String perform(String num1, String num2) {
//				String num1 = "111111111111111111111111111";
//				String num2 = "1111111111111111111110000";
				int i,j;
				int len1 = num1.length();
				int len2 = num2.length();
				int len3 = 0;
				char[] c1 = num1.toCharArray();
				char[] c2 = num2.toCharArray();
				int[] i1 = new int[300];
				int[] i2 = new int[300];
				int carry=0;
				String ans="";
				
				if(len1>len2){
					len3 = len1;
				}else {
					len3 = len2;
				}

				for(i=0; i<len1; i++){
					i1[len1-i-1]= 0;
					i1[len1-i-1]=Integer.parseInt(String.valueOf(c1[i]));
				}
				
				for(i=0; i<len2; i++){
					i2[len2-i-1]= 0;
					i2[len2-i-1]=Integer.parseInt(String.valueOf(c2[i]));
				}
/*			
				for(j=0; j<len1; j++){
					System.out.print(i1[j]);
				}
				System.out.println();
				for(j=0; j<len2; j++){
					System.out.print(i2[j]);
				}
				System.out.println();
*/	
				for(i=0;i<len3;i++){
					ans = String.valueOf((i1[i]-i2[i]+carry+10)%10)+ans;
					carry = (i1[i]-i2[i]+carry+10)/10-1;
				}
				
				while(ans.startsWith("0") && !ans.equals("0"))
					ans = ans.substring(1);
				
//					System.out.print(ans);

				
				return ans;
			}

}
