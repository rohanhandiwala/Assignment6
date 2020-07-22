package assignment6;
import java.util.Scanner;

public class assignment6_problem2b {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String response = "";

		do{ 

			System.out.print("(e)ncode, (d)ecode, or (q)uit: ");

			response = sc.nextLine();

			if(response.toLowerCase().equals("q")) {

				return;

			}

			int num = -1;

			while(num <1 || num > 5) {

				System.out.print("Enter a number between 1 and 5: ");

				 num = Integer.parseInt(sc.nextLine());

				 if(num <1 || num >5) {

					 System.out.println("Enter a number within the range!");

				 }

			}	

			if(response.toLowerCase().equals("e")) {

				System.out.print("Enter a phrase to encode: ");

				String str = sc.nextLine();

				String returnstr = assignment6_problem2a.add_letters(str, num);

				returnstr = assignment6_problem2a.shift_characters(returnstr, num);

				System.out.println("Your encoded word is: " + returnstr);

	

			}else if(response.toLowerCase().equals("d")) {

				System.out.print("Enter a phrase to decode: ");

				String str = sc.nextLine();

				int negative = num*-1;

				String retstr = assignment6_problem2a.remove_letters(str, num);

				retstr = assignment6_problem2a.shift_characters(retstr, negative);

				System.out.println("Your decoded word is: " + retstr);

			}

			System.out.println();

		} while(!(response.toLowerCase().equals("q")));

		

	}

}