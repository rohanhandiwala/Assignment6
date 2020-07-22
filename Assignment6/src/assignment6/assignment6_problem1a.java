package assignment6;

import java.util.Scanner;

public class assignment6_problem1a {
	public static void main(String[] args) {
		
		boolean bool = false;
		while(bool==false) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a user name: ");
			
			String user = sc.nextLine();
			
			boolean alpha = true;
			boolean fl = true;
			int uppercase = 0;
			int lowercase = 0;
			int digits = 0;
			
			for(int i = 0; i<user.length(); i++) {
				char c = user.charAt(i);
				
				
				
				if(!(Character.isDigit(c)||Character.isLetter(c)) && alpha ==true) {
					alpha=false;
				}
				
				
				if((i ==0 || i==user.length()-1) && (fl == true)) {
					if(Character.isDigit(c) == true){
						fl = false;
					}
				}
				
				
				if(Character.isUpperCase(c)) {
					uppercase++;
				}
	
				
				if(Character.isLowerCase(c)) {
					lowercase++;
				}

				if(Character.isDigit(c)) {
					digits++;
				}
			}
			
			System.out.println("* Length of username: " + user.length());
			System.out.println("* All characters are alpha-numeric: " + (alpha ? "True" : "False" ));
		
			
			System.out.println("* First & last characters are not digits: " + (fl ? "True" : "False"));
			System.out.println("* # of uppercase characters in the username: " + uppercase);
			System.out.println("* # of lowercase characters in the username: " + lowercase);
			System.out.println("* # of digits in the username: " + digits);
			
			if((user.length()>=8 && user.length()<=15) && (alpha ==true) && 
			   (fl == true) && (uppercase>0) && (lowercase>0) && (digits >0)) {
				System.out.println("Username is valid!");
				bool = true;
			}else {
				System.out.println("Username is invalid, please try again");
				System.out.println();
			}
		}
 
	}
}