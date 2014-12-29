package cultureGen.pays;

public enum Pays {
	AUSTRALIE("AUS","CANBERRA"), BELGIQUE("BEL","BRUXELLE"), BRESIL("BRA","BRASILIA"), ESPAGNE("ESP","MADRID"), FRANCE(
			"FRA","PARIS"), JAPON("JAP","tokyo");
	private String abbreviation;
	private String capitale;
	

	private Pays() {

	}

	private Pays(String abbr,String capi) {
		this.abbreviation = abbr;
		this.capitale=capi;
		
	}

	public String getAbbreviation() {
		return abbreviation;
	}
	public String getCapitale(){
		return capitale;
	}

}
