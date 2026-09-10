package multipleSteps;

import java.awt.Color;
import jconsole.JConsole;

public class Step_5_Final {
	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		
		//TODO: Declare your variables here

		console.println ("Step 5. THE END. DECOMPOSITION IN PRIME FACTORS");
		console.println ("---------------------------------------------");
		console.println ();

		// TODO: COMPLETE
		// If something can be done using the available functions,
		// then it MUST be done using those functions.
		
		
		console.setCursorPosition (0, console.getRows() - 1);
		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);

	}

	/*TODO: Copy here the functions created in the previous steps*/
}
