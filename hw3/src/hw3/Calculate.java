package hw3;

public class Calculate {
	public int divide(int a, int b){
		while(a%b==0){
			a = a/b;
		}
		return a;
	}
	
	public boolean isTrue(int num){
		num = divide(num,2);
		num = divide(num,3);
		num = divide(num,5);
		return (num == 1) ? true : false;
	}
	
	public int getythnum(int y){
		int i = 1;
		int count = 1;
		
		while(count<y){
			i++;
			if(isTrue(i)){
				count++;
			}
		}
		
		return i;
		
	}
}
