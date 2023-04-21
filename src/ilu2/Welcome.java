package ilu2;

import java.util.Iterator;

public class Welcome {
	
	private static String nameWUpperCase(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		return input;
	}

	public static String welcome(String input) {
		StringBuilder str = new StringBuilder();
		
		str.append("Hello, ");
		
		if (input == null || input.trim().equals("")) {
			str.append("my friend");
			return str.toString();
		}
		
		String[] noms = input.split(",");
		
		if (input.toUpperCase().equals(input)) {
			str.setLength(0);
			str.append("HELLO, " + input + " !");
			
		} else if (noms.length > 1) {
			for (int i = 0; i < noms.length-1; i++) {
				str.append(nameWUpperCase(noms[i].trim()) + ", ");
			}
			str.append(nameWUpperCase(noms[noms.length - 1].trim()));
			
		} else {
			str.append(nameWUpperCase(input));
			
		}
		
		return str.toString();
	}
}
