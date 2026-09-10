package multipleSteps;

import java.awt.Color;

import jconsole.JConsole;

public class Step_2 {

	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,40);
		int howMany, seen, primeCandidate;

		console.println ("Step 2. PRIME NUMBERS");
		console.println ("---------------------");
		console.println ();

		console.print ("How many prime numbers do you wish to see? ");
		console.setForegroundColor(Color.GREEN);
		howMany = console.readInt();
		console.resetColor ();
		console.println ();

		console.println ("The first "+howMany+" prime numbers are:\n ");

		primeCandidate = 2;
		seen = 0;
		while (seen < howMany) {
			if (isPrimeNumber (primeCandidate)) {
				seen++;
				console.println ("  "+seen+".-\t "+primeCandidate);
			}
			primeCandidate++;
		}
		// en arribar a aquest punt vistos == quants

		console.println ("\n\n");

		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
	}

	public static int countProperDivisors (int n) {

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
	
}
