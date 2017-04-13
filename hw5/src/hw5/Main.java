package hw5;
import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args){
		scan = new Scanner(System.in);
		Document d = new Document();
		Email e = new Email();
		File f = new File();
		
		String mode = scan.nextLine();
		String type = scan.nextLine();
		String check;
		String change;
		
		if(type.equals("Document")){
			d.setText(scan.nextLine());
		}
		if(type.equals("Email")){
			e.setSender(scan.nextLine());
			e.setRecipient(scan.nextLine());
			e.setTitle(scan.nextLine());
			e.setText(scan.nextLine());
		}
		if(type.equals("File")){
			f.setPathname(scan.nextLine());
			f.setText(scan.nextLine());
		}
		
		
		if(mode.equals("A") || mode.equals("C")){
//			System.out.println(type.toString());
			if(type.equals("Document")){
				if(mode.equals("C")){
					change = scan.nextLine();
					d.setText(scan.nextLine());
				}
				
				System.out.println(d.toString());
			} 
			
			else if (type.equals("Email")){
				if(mode.equals("C")){
					change = scan.nextLine();
					if(change.equals("text"))
						e.setText(scan.nextLine());
					if(change.equals("sender"))
						e.setSender(scan.nextLine());
					if(change.equals("recipient"))
						e.setRecipient(scan.nextLine());
					if(change.equals("title"))
						e.setTitle(scan.nextLine());
				}
				
				System.out.println( "From: " + e.getSender() );
				System.out.println( "To: " + e.getRecipient() );
				System.out.println( "Title: " + e.getTitle() );
				System.out.println(e.toString());
			} 
			else if (type.equals("File")){
				if(mode.equals("C")){
					change = scan.nextLine();
					if(change.equals("text"))
						f.setText(scan.nextLine());
					if(change.equals("pathname"))
						f.setPathname(scan.nextLine());
				}
				
				
				System.out.println( "Path: " + f.getPathname() );
				System.out.println(f.toString());
			}
		}
		
		
		if(mode.equals("B")){
			check = scan.nextLine();
			
			if(type.equals("Document")){
				System.out.println(d.toString().contains(check));
			} 
			else if(type.equals("Email")){
				System.out.println(e.toString().contains(check));
			}
			else if(type.equals("File")){
				System.out.println(f.toString().contains(check));
			}
				
		}
		

		
	}
}
