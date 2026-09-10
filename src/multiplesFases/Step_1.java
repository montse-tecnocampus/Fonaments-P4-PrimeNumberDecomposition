package multiplesFases;

import java.awt.Color;
import jconsole.JConsole;

public class Step_1 {
	
	public static void main (String [] args) {
	
		JConsole console = new JConsole(80,20);
		
		int numero;

		console.println ("Step 1. PROPER DIVISORS");
		console.println ("-----------------------");
		console.println ();

		console.print ("Enter number: ");
		console.setForegroundColor(Color.GREEN);
		numero = console.readInt();
		console.resetColor ();
		console.println ();

		console.println ("Number "+numero+" has "+properDivisors(numero)+" proper divisors");

		console.setCursorPosition (0, console.getRows()-1);
		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
		
	}
	
	
	private static int properDivisors (int n) {

		int q = 1;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				q++;
			}
		}
		return q;
	}
	

}
