package ilu2;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder str = new StringBuilder();
		str.append("Hello, ");
		
		if (input == null || input.trim().equals("")) {
			str.append("my friend");
		} else if (input.toUpperCase().equals(input)) {
			str.setLength(0);
			str.append("HELLO, " + input + " !");
		} else {	
			input = input.substring(0, 1).toUpperCase() + input.substring(1);
			str.append(input);
		}
		
		return str.toString();
	}
}
