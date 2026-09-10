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
		while (/*TODO: Complete condition*/) {
			//TODO: Complete code
		}
		// at this point, seen...

		console.println ("\n\n");

		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
	}

	//TODO: Copy the function developed in the previous phase here

	//TODO: Write the function that determines whether a number is prime or not here.
	
}
