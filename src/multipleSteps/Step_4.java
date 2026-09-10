package multipleSteps;

import java.awt.Color;
import java.util.Random;

import jconsole.JConsole;

public class Step_4 {
	
	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		
		boolean keepTrying;
		int value;
		char answer;
		int min, max;
		Random rand = new Random();

		console.println ("Step 4. INPUT FILTER");
		console.println ("--------------------");
		console.println ();
		console.println ("This program allows you to test the \"read\" function");
		console.println ();

		keepTrying = true;
		while (keepTrying) {
			min = rand.nextInt(2,2001);
			max = rand.nextInt(200000);
			//max = rand.nextInt(200000-min)+min;
			value = read ("\nInsert number", min, max, console);
			if (value<min || value > max) {
				console.setForegroundColor(Color.YELLOW);
				console.println ("Wrong value "+value+". It seems like the read function is not working properly");
			} else {
				console.print("Value "+value+" within the specified interval");
				console.setForegroundColor(Color.GREEN);
				console.println(" OK!");
			}
			console.resetColor();
			console.println ();
			console.print ("Do you want to test it again? (Y/y for yes, any other char for no) ");
		
			console.setForegroundColor(Color.GREEN);
			answer = console.readChar();
			console.resetColor ();
			keepTrying = answer == 'y' || answer == 'Y';
			if (keepTrying) {
				console.clear(); console.println(); 
			}
		}

		console.println ("\n\n");
		console.print ("Press any key to exit");
		console.readKey (true);
		System.exit(0);
	}


	/*TODO: Write the code here for the filter function that
	 "insists" until it obtains a number within the specified range */
}
