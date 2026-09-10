package multipleSteps;

import java.awt.Color;
import jconsole.JConsole;

public class Step_1 {
	
	public static void main (String [] args) {
	
		JConsole console = new JConsole(80,20);
		
		/*TODO: Complete an execution entry point (main) that asks
		the user for an integer and responds with the number
		of proper divisors of that number, obtained by invoking
		the countProperDivisors function.*/
	

		console.setCursorPosition (0, console.getRows()-1);
		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
		
	}
	
	
	//TODO: Write the code for the function that calculates the number of proper divisors of its parameter here
	

}
