package ilu2;


public class Welcome {
	
	private static String nameWUpperCase(String input) {
		input = input.substring(0, 1).toUpperCase() + input.substring(1);
		return input;
	}

	public static String welcome(String input) {
		
// ------------------------------ TRAVAIL FAIT JUSQU'A L'ITER_7 (EX_7) ------------------------------
		
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
		
		for (int i = 0; i < k; i++) { //ajout de la partie minuscule du message
			
			if (i == k-1) {
				str.setLength(str.length()-2);
				str.append(" and "); // suppression de la virgule et remplacement par "and"
			}
			str.append(nomsMin[i] + ", "); 

		}
		str.setLength(str.length()-2); //on enlève la virgule non nécessaire à la fin du message
		
		if (j>0) { //si des noms en majuscules ont été donnés
			
			if (nomsMin[0] == null) { //si pas de nom en minuscules
				str.setLength(0);
				str.append("HELLO, ");
			} else {
			str.append(". AND HELLO, ");
			}
			
			for (int i = 0; i < j; i++) { //ajout de la partie majuscule du message
					
				if (i == j-1) {
					str.setLength(str.length()-2);
					str.append(" AND "); // suppression de la virgule et remplacement par "and"
				}
				str.append(nomsMaj[i] + ", ");
				
			}
			str.setLength(str.length()-2); //on enlève la virgule non nécessaire à la fin du message
			str.append(" !");
		}
		

		return str.toString();
	}
}
