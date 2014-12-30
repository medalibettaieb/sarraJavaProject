package cultureGen.test;

import cultureGen.pays.Pays;
import cultureGen.ui.FenetrePrincipale;

public class TestJeu {

	public static void main(String[] args) {
		String abbrev = "FRA";
		String capital = null;
		Pays[] pays = Pays.values();
		for (int i = 0; i < pays.length; i++) {
			if (pays[i].getAbbreviation().equalsIgnoreCase(abbrev)) {
				capital = pays[i].getCapitale();

			} else {
				System.out.println("capitale non exixtante");
			}
		}
		System.out.println(capital);

	}

}
