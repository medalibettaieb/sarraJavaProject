package cultureGen.pays;

public enum Pays {
	AUSTRALIE("AUS"), BELGIQUE("BEL"), BRESIL("BRA"), ESPAGNE("ESP"), FRANCE(
			"FRA"), JAPON("JAP");
	private String abbreviation;

	private Pays() {

	}

	private Pays(String abbr) {
		this.abbreviation = abbr;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

}
