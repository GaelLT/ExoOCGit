package test;

import java.util.Arrays;

public class Test {

	public String concat(String str, String str2) {
		String nString = str.concat(str2);
		return nString;
	}

	public int divisionEntiereSansSlash(int a, int b) {
		System.out.println("\n****Division Entière****");
		int c = 0;
		if (a != (b * c)) {
			while ((a < b * c) || (a >= b * (c + 1))) {
				c++;
				System.out.println(c);
			}
		}
		System.out.println("a : " + a + " b : " + b);
		System.out.println("c : " + c);
		return c;
	}

	public int divisionEntiereAvecSlash(int a, int b) {
		System.out.println("\n****Division Entière 2****");
		int c = 0;
		while (a / b != c) {
			c++;
		}
		System.out.println(c);
		return c;
	}

	public String rechercheTableau(int tab[], int a) {
		System.out.println("****Recherche Tableau****");
		int i = 0;
		String response = "";
		try {
			while (a != tab[i] && i < tab.length) {
//				System.out.println("Verif perso : " + tab[i]);
				i++;
			}
			if (a == tab[i]) {
				response = "oui";
			}
		} catch (ArrayIndexOutOfBoundsException exception) {
			response = "non";
		}
		System.out.println(response);
		return response;
	}

	public String rechercheBinaire(int tab[], int valeurCherchee) {
		System.out.println("****Recherche Binaire****");
		Arrays.sort(tab);
		String reponse = "";
		if (Arrays.binarySearch(tab, valeurCherchee) >= 0) {
			reponse = "Dans le tableau";
		} else {
			reponse = "Pas dans le tableau";
		}
		System.out.println(reponse);
		return reponse;
	}

	public int getMaximum(int tab[]) {
		int maximum = tab[0];
		for (int i = 0; i < tab.length; i++) {
//			System.out.println("Vérif :"+tab[i]);
			if (maximum < tab[i]) {
				maximum = tab[i];
			}
		}
		System.out.println("Get Maximum : " + maximum);
		return 0;
	}

	// ************************MAIN*************************
	public static void main(String[] args) {

		int[] tableau = { 0, 1, 2, 3, 4, 5, 23, 6, 7, 968, 8, 37, 9, 10, 15, 18, 79, 1024, 758, 11 };
		int[] tableau2 = { 138, 935, -2, -452, 0, 78 };
		int valeurCherchee = 11;
		int binSearch = -2;

		Test test = new Test();
		test.rechercheTableau(tableau, valeurCherchee);
		test.rechercheBinaire(tableau, valeurCherchee);

		Arrays.sort(tableau2);
		System.out.println("\nBinary Search : " + Arrays.binarySearch(tableau, valeurCherchee));

		// Recherche Maximum
		int maximum = tableau[0];
		for (int i = 0; i < tableau.length; i++) {
//			System.out.println("Vérif :"+tableau[i]);
			if (maximum < tableau[i]) {
				maximum = tableau[i];
			}
		}
		System.out.println("Maximum : " + maximum);
		// ********************
		test.getMaximum(tableau2);

//		test.divisionEntiereAvecSlash(4, 4);
//		test.divisionEntiereAvecSlash(10, 4);
//		test.divisionEntiereAvecSlash(10, 40);
		test.divisionEntiereSansSlash(4, 4);
		test.divisionEntiereSansSlash(10, 5);
		test.divisionEntiereSansSlash(10, 100);

	int tab[] = {1,2,053,4};
	int table[][] = {{1,2,4}, {2,2,1}, {0,43,2}};
	
	System.out.println(tab[3]==table[0][2]);
	System.out.println(tab[2]);
	System.out.println(table[2][1]);
	System.out.println(" "+(tab[2]==table[2][1]));
		
	}

}
