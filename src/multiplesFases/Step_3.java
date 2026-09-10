package multiplesFases;

import java.awt.Color;
import jconsole.JConsole;

public class Step_3 {

	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		int elNumero, elCandidat;

		console.println ("Fase 3. VEGADES QUE DIVIDEIX");
		console.println ("----------------------------");
		console.println ();

		console.print ("Quin és el número?  ");
		console.setForegroundColor(Color.GREEN);
		elNumero = console.readInt();
		console.resetColor ();
		console.print ("Quin és el candidat a divisor?  ");
		console.setForegroundColor(Color.GREEN);
		elCandidat = console.readInt();
		console.resetColor ();
		console.println ();

		console.println (elCandidat+" divideix "+elNumero+" "+quantesVegadesDivideix(elNumero,elCandidat)+" vegades"); 


		console.setCursorPosition (0, console.getRows()-1);
		console.print ("Premeu qualsevol tecla per acabar");
		console.readKey (true);
		System.exit(0);
	}

	static int quantesVegadesDivideix (int n, int candidat) {
		int vegades, residu;

		vegades = 0;
		residu = n % candidat;
		while (residu == 0) {
			// si som aqui el residu és zero
			vegades++;
			n = n / candidat;
			residu = n % candidat;
		}
		// en arribar a aquest punt el residu de la divisió és
		// diferent de zero i això vol dir que ja no es pot continuar dividint

		return vegades;

	}
}
