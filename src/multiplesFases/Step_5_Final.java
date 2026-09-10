package multiplesFases;

import java.awt.Color;
import jconsole.JConsole;

public class Step_5_Final {
	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		
		int number;
		int times;

		console.println ("Step 5. THE END. DECOMPOSITION IN PRIME FACTORS");
		console.println ("---------------------------------------------");
		console.println ();

		number = read ("Number that will be factorized", 2, 199999, console);

		console.println ();

		if (isPrimeNumber (number)) {
			console.println (number+" is itself a prime number!");
		} 
		else {
			console.println (number+" is decomposed in prime numbers in the following way:");
			console.println ();
			for (int i = 2; i <= number/2; i++) {
				if (isPrimeNumber (i)) {
					times = timesItCanBeDivided (number, i);
					if (times != 0) {
						console.println ("   "+i+" to the power of "+times);
					}
				}
			}
		}
		console.setCursorPosition (0, console.getRows() - 1);
		console.print ("Press any key to exit");
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

	static int countProperDivisors (int n) {

		int q = 1;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n%i==0) {
				q++;
			}
		}
		return q;
	}

	static boolean isPrimeNumber (int n) {
		return countProperDivisors(n) == 1;
	}

	public static int timesItCanBeDivided (int number, int candidate) {
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

	public static int read (String msg, int min, int max, JConsole console) {
		int number;

		console.print (msg+" ["+min+","+max+"]: ");
		console.setForegroundColor(Color.GREEN);
		number = console.readInt();

		while (!(number>=min && number<=max)) {
			console.setForegroundColor(Color.RED);
			console.println ("   Number out of bounds. It must be within range "+min+" and "+max);
			console.resetColor ();
			console.print (msg+" ["+min+","+max+"]: ");
			console.setForegroundColor(Color.GREEN);
			number = console.readInt();
		}
		console.resetColor ();
		return number;
	}
}
