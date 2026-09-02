package multiplesFases;

import java.awt.Color;

import jconsole.JConsole;

public class Fase_2 {

	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,40);
		int quants, vistos, candidatAPrimer;

		console.println ("Fase 2. PRIMALITAT");
		console.println ("------------------");
		console.println ();

		console.print ("Quants números primers vols veure? ");
		console.setForegroundColor(Color.GREEN);
		quants = console.readInt();
		console.resetColor ();
		console.println ();

		console.println ("Els "+quants+" primers números primers són:\n ");

		candidatAPrimer = 2;
		vistos = 0;
		while (vistos < quants) {
			if (esPrimer (candidatAPrimer)) {
				vistos++;
				console.println ("  "+vistos+".-\t "+candidatAPrimer);
			}
			candidatAPrimer++;
		}
		// en arribar a aquest punt vistos == quants

		console.println ("\n\n");

		//Console.SetCursorPosition (0, Console.WindowHeight-1);
		console.print ("Premeu qualsevol tecla per acabar");
		console.readKey (true);
		System.exit(0);
	}

	static int divisorsPropis (int n) {
		int q = 1;

		for (int i = 2; i <=Math.sqrt(n); i++) {
			if (n%i==0) {
				q++;
			}
		}
		return q;
	}

	static boolean esPrimer (int n) {
		return divisorsPropis(n) == 1;
	}
	
}
