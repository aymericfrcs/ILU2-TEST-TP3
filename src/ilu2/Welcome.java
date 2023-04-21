package ilu2;

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
			str.append(nameWUpperCase(noms[0]).trim() + ", ");
			str.append(nameWUpperCase(noms[1].trim()));
		} else {	
			str.append(nameWUpperCase(input));
		}
		
		return str.toString();
	}
}
