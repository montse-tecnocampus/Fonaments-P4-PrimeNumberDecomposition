package multipleSteps;

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

		//TODO: Complete following instructions in the statement

		console.setCursorPosition (0, console.getRows()-1);
		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
	}

	//TODO: Write the code here for the function that calculates how many times
	// a number is divisible by another.
}
