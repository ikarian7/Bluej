package bluejtoets;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.ArrayList;

public class GUI extends Applet {
Zender zender1;
Zender zender2;
Zender zender3;
Gids gids;

public void init(){

	Programma programma1 = new Programma("De Wereld Draait Door", new Datum(14, 1, 2016));
	Programma programma2 = new Programma("Ik hou van holland", new Datum(14, 1, 2016));
	Programma programma3 = new Programma("Wie is de mol?", new Datum(14, 1, 2016));
	Programma programma4 = new Programma("Weet ik veel!?", new Datum(14, 1, 2016));	
	zender1 = new Zender("nederland1");
	zender2 = new Zender("nederland2");
	zender3 = new Zender("nederland3");
	
	zender1.addProgramma(programma1);
	zender2.addProgramma(programma2);
	zender3.addProgramma(programma3);
	zender1.addProgramma(programma4);
}

public void paint(Graphics g){
	int x = 20;
	int y = 20;
	
	g.drawString("Programma's " + zender1.getNaam() + ":", x, y);

	ArrayList<Programma> Zenderprogramma1 = zender1.getProgrammalijst();
	
	for(Programma programma1: Zenderprogramma1){
		y += 20;
		g.drawString(programma1.getNaam()+ "     datum: "  + programma1.getZenderdatum()  , x, y);
	}
	y += 30;
	g.drawString("Programma's " + zender2.getNaam() + ":", x, y);
	
	ArrayList<Programma> Zenderprogramma2 = zender2.getProgrammalijst();
		
	for(Programma programma2: Zenderprogramma2){
		y += 30;
		g.drawString(programma2.getNaam()+ "     datum: "  + programma2.getZenderdatum()  , x, y);
	}
	y += 30;
	g.drawString("Programma's " + zender3.getNaam() + ":", x, y);
	ArrayList<Programma> Zenderprogramma3 = zender3.getProgrammalijst();
		
	for(Programma programma3: Zenderprogramma3){
		y += 30;
		g.drawString(programma3.getNaam()+ "      datum: "  + programma3.getZenderdatum()  , x, y);
		}
	}
}
