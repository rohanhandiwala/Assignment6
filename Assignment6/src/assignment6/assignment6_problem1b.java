package assignment6;

import java.util.Scanner;

public class assignment6_problem1b {
	public static void main(String[] args) {
		
		boolean bool = false;
		String username ="";
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
				char ch = user.charAt(i);
				
				
				
				if(!(Character.isDigit(ch)||Character.isLetter(ch)) && alpha ==true) {
					alpha=false;
				}
				
				
				if((i ==0 || i==user.length()-1) && (fl == true)) {
					if(Character.isDigit(ch) == true){
						fl = false;
					}
				}
				
				
				if(Character.isUpperCase(ch)) {
					uppercase++;
				}
	
			
				if(Character.isLowerCase(ch)) {
					lowercase++;
				}
				
				
				if(Character.isDigit(ch)) {
					digits++;
				}
			}
			
			System.out.println("* Length of username: " + user.length());
			System.out.println("* All characters are alpha-numeric: " + (alpha ? "True" : "False"));
			System.out.println("* First & last characters are not digits: " + (fl ? "True" : "False"));
			System.out.println("* # of uppercase characters in the username: " + uppercase);
			System.out.println("* # of lowercase characters in the username: " + lowercase);
			System.out.println("* # of digits in the username: " + digits);
			
			if((user.length()>=8 && user.length()<=15) && (alpha ==true) && 
					(fl == true) && (uppercase>0) && (lowercase>0) && (digits >0)) {
				System.out.println("Username is valid!");
				bool = true;
				username = user;
				System.out.println();
			}else {
				System.out.println("Username is invalid, please try again");
				System.out.println();
			}
		}
		boolean bool2 = false;
		while(bool2==false) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a password: ");
			
			String password = sc.nextLine();
			
			int uppercase2 = 0;
			int lowercase2 = 0;
			int digits2 = 0;
			int special = 0;
			boolean within = false;
			
			if(password.contains(username)) {
				within = true;
			}
			
			for(int i = 0; i<password.length(); i++) {
				char ch2 = password.charAt(i);
				
					
				
				if(Character.isUpperCase(ch2)) {
					uppercase2++;
				}
	
				if(Character.isLowerCase(ch2)) {
					lowercase2++;
				}
				
				
				if(Character.isDigit(ch2)) {
					digits2++;
				}
				
				if((ch2 == '#') || (ch2 == '%') || (ch2 == '&') || (ch2 == '$')) {
					special++;
				}
				
				
			}
			
			System.out.println("* Length of password: " + password.length());
			System.out.println("* Username is part of password: " + (within ? "True" : "False"));
			System.out.println("* # of uppercase characters in the password: " + uppercase2);
			System.out.println("* # of lowercase characters in the password: " + lowercase2);
			System.out.println("* # of digits in the password: " + digits2);
			System.out.println("* # of special characters in the password: " + special);
			
			if((password.length()>=8) && (uppercase2>0) && (lowercase2>0) && (digits2 >0) 
				&& (special > 0) && (within == false)) {
				System.out.println("Password is valid!");
				bool2 = true;
			}else {
				System.out.println("Password is invalid, please try again");
				System.out.println();
			}
		}
 
	}
}