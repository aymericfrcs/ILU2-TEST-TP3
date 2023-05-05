package ilu2;


public class Welcome {
	
	private static String nameWUpperCase(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		return input;
	}

	public static String welcome(String input) {
		StringBuilder str = new StringBuilder();
		
		
		
		if (input == null || input.trim().equals("")) { //pas de nom
			str.append("Hello, my friend");
			return str.toString();
		}
		
		String[] noms = input.split(",");
		String[] nomsMaj = new String[noms.length];
		String[] nomsMin = new String[noms.length];
		
		int j = 0;
		int k = 0;

		
		for (int i = 0; i<noms.length; i++) { //tri des noms entre minuscules et majuscules
			if (noms[i].toUpperCase().equals(noms[i])) {
				nomsMaj[j] = noms[i].trim();
				j++;
			} else {
				nomsMin[k] = nameWUpperCase(noms[i].trim());
				k++;
			}
		}

		
		str.append("Hello, ");
		
		for (int i = 0; i < nomsMin.length; i++) { //ajout de la partie minuscule du message
			if (nomsMin[i] != null) {
				str.append(nomsMin[i] + ", "); 
			}
		}
		str.setLength(str.length()-2); //on enlève la virgule non nécessaire à la fin du message
		
		if (j>0) {
			
			if (nomsMin[0] == null) { //si pas de nom en minuscules
				str.setLength(0);
				str.append("HELLO, ");
			} else {
			str.append(". AND HELLO, ");
			}
			
			for (int i = 0; i < nomsMaj.length; i++) { //ajout de la partie majuscule du message
				if (nomsMaj[i] != null) {
					str.append(nomsMaj[i] + ", ");
				}
			}
			str.setLength(str.length()-2); //on enlève la virgule non nécessaire à la fin du message
			str.append(" !");
		}
		

		return str.toString();
	}
}
