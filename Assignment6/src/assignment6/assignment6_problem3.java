package assignment6;

public class assignment6_problem3 {
	
	public static void main(String[]args){
		
		System.out.println(string_isupper("ABC"));
		System.out.println(string_length("apple"));
		System.out.println (string_isalpha("pear!") ); 
		System.out.println (string_isalpha("apple") ); 
		System.out.println (string_swapcase("123 AbC")); 
		System.out.println(string_swapcase("")); 
		System.out.println(string_lower("PEAR" + "" + "123 AbC"));
		System.out.println ( string_isupper(""));  
	}
	
	public static int string_length(String str) {
		
		int i=0;
		
		while(true) {
			
			try {
				
				str.charAt(i);
				i++; 
				
			} catch (Exception e) {
				
				break; 
			}
			
		}
		
		return i;
		
				
			}
	
	public static boolean string_isalpha(String str) {
		
		if (string_length(str)==0) {
			return false;
		}
			for (int i=0; i<string_length(str); i++) {
			
				char j=str.charAt(i);
				
				if (!(j >= 'a' && j <= 'z') && !(j >= 'A' && j<= 'Z')) {
					
					return false;
					
				}
			}
			
			return true;
	}
	
	public static boolean string_isdigit (String str) {
		
		if (string_length(str)==0) {
			return false;
		}
		
		for (int i=0; i<string_length(str); i++) {
			
			char j =str.charAt(i);
			
			if (!(j>= '0' && j <= '9')) {
				return false;
			}
		}
		
		return true;
	}
	 
	public static String string_swapcase(String str) {
	    char[] chars = str.toCharArray();
	    for (int i = 0; i < chars.length; i++)
	    {
	        char c = chars[i];
	        if (Character.isUpperCase(c))
	        {
	            chars[i] = Character.toLowerCase(c);
	        }
	        else if (Character.isLowerCase(c))
	        {
	            chars[i] = Character.toUpperCase(c);
	        }
	    }
	    return new String(chars);
	}
	
	public static String string_lower(String str) {
		
		String newString = "";
		
				for (int i=0; i<string_length(str); i++) {
					
					char j=str.charAt(i);
					
						if (65 <= j && j<= 90) {
							
							j = (char)(j + 32);
						}
							newString += (j);
				}
				
				return newString;
	}
	
	
public static boolean string_isupper (String str) {
		
		if (string_length(str)==0) {
			return false;
		}
		
		for (int i=0; i<string_length(str); i++) {
			
			char j =str.charAt(i);
			
			if (!(j>= 'A' && j <= 'Z')) {
				return false;
			}
		}
		
		return true;
	}
	
	
}