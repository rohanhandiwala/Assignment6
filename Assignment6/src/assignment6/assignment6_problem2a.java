package assignment6;

import java.util.Random;

public class assignment6_problem2a {
	
	public static String add_letters(String word, int num) {
		String string = word;
		String retStr ="";
		
		Random rand = new Random();
		String randLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		int y = randLetters.length();

		String letters ="";
		for(int i=0; i<string.length(); i++) {
			
			for(int j =0; j<num; j++) {
				letters += randLetters.charAt(rand.nextInt(y));
			}
			String thing = string.substring(i,i+1);
			thing = thing + letters;
			retStr += thing;
			thing="";
			letters="";
		}
		return retStr;
	}
	
	public static String remove_letters(String word, int num) {
		
		String str = "";

		for (int i = 0; i < word.length(); i++) {
			if (i % (num + 1) == 0)
				str = str + word.charAt(i);
		}

		return str;
	}
	
	public static String shift_characters(String word, int num) {
		int ctr = 0;
		char letter;
		String returnstring = "";
		int asciiVal;
		while(ctr<word.length()) {
			letter = word.charAt(ctr);
			asciiVal = (int) (letter);
			asciiVal = asciiVal + num;
			returnstring = returnstring + (char)(asciiVal);
			ctr++;
		}
		
		return returnstring;
	}
	
	public static void main(String[] args) {
		String original = "Hello!";
		for (int num = 1; num < 5; num++) {
			String scrambled = add_letters(original, num);
			System.out.println("Adding " + num + " random character(s) to " + original + "->" + scrambled);
		}
		
		String word1 = "HdeulHlHom!t";
		String unscrambled1 = remove_letters(word1,1);
		System.out.println("Removing 1 character from " + word1 + " -> " + unscrambled1);
		
		String word2 = "Pears are yummy!";
		String unscrambled2 = remove_letters(word2,1);
		System.out.println("Removing 1 character from " + word2 + " -> " + unscrambled2);
		
		String word3 = "Pears are yummy!";
		String newword3 = shift_characters(word2, 2);
		System.out.println(word3 + " shifted by +2 is " + newword3);
		
		String unscrambled3 = shift_characters(newword3, -1);
		System.out.println(newword3 + " shifted by -1 is " + unscrambled3);
		
	}
}