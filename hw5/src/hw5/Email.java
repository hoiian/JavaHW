package hw5;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title;
	
	public Email(){
//		sender = null;
//		recipient = null;
//		title = null;
	}
	

	
	public String toString() {
//		System.out.println( "From: " + sender);
//		System.out.println( "To: " + recipient);
//		System.out.println( "Title: " + title);
//		System.out.println(text);

		return text;
	}
	
	public  void setSender(String s){
		sender = s;
	}
	
	public String getSender(){
		return sender;
	}
	
	public  void setRecipient(String r){
		recipient = r;
	}
	
	public String getRecipient(){
		return recipient;
	}
	
	public  void setTitle(String t){
		title = t;
	}
	
	public String getTitle(){
		return title;
	}
	
}
