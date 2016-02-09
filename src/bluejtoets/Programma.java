package bluejtoets;

public class Programma {
	String naam;
	Datum zenderdatum;
	
	public Programma(String naam, Datum zenderdatum) {
		super();
		this.naam = naam;
		this.zenderdatum = zenderdatum;
	}
	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	public Datum getZenderdatum() {
		return zenderdatum;
	}
	public void setZenderdatum(Datum zenderdatum) {
		this.zenderdatum = zenderdatum;
	}
}
