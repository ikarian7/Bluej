package bluejtoets;

import java.util.ArrayList;

public class Gids {
String zendernaam;
ArrayList<Zender> zenderlijst;

public Gids(String zendernaam, ArrayList<Zender> zenderlijst) {
	super();
	this.zendernaam = zendernaam;
	this.zenderlijst = zenderlijst;
}

public String getZendernaam() {
	return zendernaam;
}

public void setZendernaam(String zendernaam) {
	this.zendernaam = zendernaam;
}

public ArrayList<Zender> getZenderlijst() {
	return zenderlijst;
}

public void setZenderlijst(ArrayList<Zender> zenderlijst) {
	this.zenderlijst = zenderlijst;
}
public void addProgramma(Zender Zender){
	zenderlijst.add(Zender);
	}

}

