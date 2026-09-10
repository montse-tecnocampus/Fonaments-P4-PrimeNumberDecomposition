package multiplesFases;

import java.awt.Color;
import jconsole.JConsole;

public class Step_3 {

	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		int number, candidate;

		console.println ("Step 3. TIMES IT DIVIDES");
		console.println ("------------------------");
		console.println ();

		console.print ("What is the number? ");
		console.setForegroundColor(Color.GREEN);
		number = console.readInt();
		console.resetColor ();
		console.print ("What is the candidate divisor? ");
		console.setForegroundColor(Color.GREEN);
		candidate = console.readInt();
		console.resetColor ();
		console.println ();

		console.println (candidate+" divides "+number+" "+timesItCanBeDivided(number,candidate)+" times"); 


		console.setCursorPosition (0, console.getRows()-1);
		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
	}

	static int timesItCanBeDivided (int number, int candidate) {
		int times, remainer;

		times = 0;
		remainer = number % candidate;
		while (remainer == 0) {
			// si som aqui el residu és zero
			times++;
			number = number / candidate;
			remainer = number % candidate;
		}
		// en arribar a aquest punt el residu de la divisió és
		// diferent de zero i això vol dir que ja no es pot continuar dividint

		return times;

	}
}
