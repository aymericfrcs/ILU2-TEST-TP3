package ilu2;

public class Welcome {

	public static String welcome(String input) {
		StringBuilder str = new StringBuilder();
		
		str.append("Hello, ");
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		str.append(input);
		
		return str.toString();
	}
}
