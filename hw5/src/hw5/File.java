package hw5;

public class File extends Document{
	private String pathname;
	
	public String toString() {
//		System.out.println( "Path: " + pathname);
//		System.out.println(text);

		return text;
	}
	public void setPathname(String p){
		pathname = p;
		
	}
	
	public String getPathname(){
		return pathname;
	}

}
