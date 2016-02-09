package bluejtoets;

import java.util.ArrayList;

public class Zender {
		String naam;
		ArrayList<Programma> programmalijst;
		
		public Zender(String naam) {
			super();
			this.naam = naam;
			programmalijst = new ArrayList<>();
		}

		public String getNaam() {
			return naam;
		}

		public void setNaam(String naam) {
			this.naam = naam;
		}

		public ArrayList<Programma> getProgrammalijst() {
			return programmalijst;
		}

		public void setProgrammalijst(ArrayList<Programma> programmalijst) {
			this.programmalijst = programmalijst;
		}
		public void addProgramma(Programma Programma){
			programmalijst.add(Programma);
			}

}