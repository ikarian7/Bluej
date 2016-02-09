package bluejtoets;

public class Datum {
	int dag;
	int maand;
	int jaar;
	
	public Datum(int dag, int maand, int jaar) {
		super();
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}

	public int getDag() {
		return dag;
	}

	public void setDag(int dag) {
		this.dag = dag;
	}

	public int getMaand() {
		return maand;
	}

	public void setMaand(int maand) {
		this.maand = maand;
	}

	public int getJaar() {
		return jaar;
	}

	public void setJaar(int jaar) {
		this.jaar = jaar;
	}
	
public String toString(){
	return "" + dag + "-" + maand + "-" + jaar;
}
}

