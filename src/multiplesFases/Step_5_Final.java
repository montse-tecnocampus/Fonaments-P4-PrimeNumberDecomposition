package multiplesFases;

import java.awt.Color;
import jconsole.JConsole;

public class Step_5_Final {
	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		
		int numero;
		int vegades;

		console.println ("Fase 5. FINAL. DESCOMPOSICIÓ EN FACTORS PRIMERS");
		console.println ("-----------------------------------------------");
		console.println ();

		numero = llegirEscaient ("Numero que s'ha de factoritzar", 2, 199999, console);

		console.println ();

		if (esPrimer (numero)) {

			console.println ("El número "+numero+" és ell mateix primer");
		} else {

			console.println ("El número "+numero+" es descomposa en factors primers de la següent manera:");
			console.println ();
			for (int i = 2; i <= numero/2; i++) {
				if (esPrimer (i)) {
					vegades = quantesVegadesDivideix (numero, i);
					if (vegades != 0) {
						console.println ("   "+i+" elevat a "+vegades);
					}
				}
			}
		}
		console.setCursorPosition (0, console.getRows() - 1);
		console.print ("Premeu qualsevol tecla per acabar");
		console.readKey (true);
		System.exit(0);

	}

	public static int divisorsPropis (int n) {
		int q = 1;

		for (int i = 2; i <= n/2; i++) {
			if (n%i==0) {
				q++;
			}
		}
		return q;
	}

	public static boolean esPrimer (int n) {
		return divisorsPropis(n) == 1;
	}

	public static int quantesVegadesDivideix (int n, int candidat) {
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

	public static int llegirEscaient (String msg, int min, int max, JConsole console) {
		int numero;

		console.print (msg+" ["+min+","+max+"]: ");
		console.setForegroundColor(Color.GREEN);
		numero = console.readInt();

		while (!(numero>=min && numero<=max)) {
			console.setForegroundColor(Color.RED);
			console.println ("   Número Fora dels límits. Ha d'estar comprès entre "+min+" i "+max);
			console.resetColor ();
			console.print (msg+" ["+min+","+max+"]: ");
			console.setForegroundColor(Color.GREEN);
			numero = console.readInt();
		}
		console.resetColor ();
		return numero;
	}
}
