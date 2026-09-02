package multiplesFases;

import java.awt.Color;
import jconsole.JConsole;

public class Fase_1 {
	
	public static void main (String [] args) {
	
		JConsole console = new JConsole(80,20);
		
		int numero;

		console.println ("Fase 1. DIVISORS PROPIS");
		console.println ("-----------------------");
		console.println ();

		console.print ("De quin n�mero en vols calcular els divisors propis? ");
		console.setForegroundColor(Color.GREEN);
		numero = console.readInt();
		console.resetColor ();
		console.println ();

		console.println ("El n�mero "+numero+" t� "+DivisorsPropis(numero)+" divisors propis");

		console.setCursorPosition (0, console.getRows()-1);
		console.print ("Premeu qualsevol tecla per acabar");
		console.readKey (true);
		System.exit(0);
		
	}
	
	
	private static int DivisorsPropis (int n) {

		int q = 1;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				q++;
			}
		}
		return q;
	}
	

}
