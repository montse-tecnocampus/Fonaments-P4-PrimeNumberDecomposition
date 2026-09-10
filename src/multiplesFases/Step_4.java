package multiplesFases;

import java.awt.Color;
import java.util.Random;

import jconsole.JConsole;

public class Step_4 {
	
	public static void main (String[] args)
	{
		JConsole console = new JConsole(80,20);
		
		boolean anarProvant;
		int valor;
		char resposta;
		int min, max;
		Random alea = new Random();

		console.println ("Fase 4. FILTRE D'ENTRADA");
		console.println ("------------------------");
		console.println ();
		console.println ("Aquest programa permet de fer proves de la funció llegirEscaient");
		console.println ();

		anarProvant = true;
		while (anarProvant) {
			min = alea.nextInt(2000)+2;
			max = alea.nextInt(200000-min)+min;
			valor = llegirEscaient ("\nintroduir numero", min, max, console);
			if (valor<min || valor > max) {
				console.setForegroundColor(Color.YELLOW);
				console.println ("Valor incorrecte "+valor+". Sembla que la funció LlegirEscaient no fa bé la seva tasca");
			} else {
				console.print("El valor "+valor+" es troba dins dels límits establerts");
				console.setForegroundColor(Color.GREEN);
				console.println(" OK!");
			}
			console.resetColor();
			console.println ();
			console.print ("Vols fer una altra prova? (S/s per sí, qualsevol altra lletra per no) ");
			console.setForegroundColor(Color.GREEN);
			resposta = console.readChar();
			console.resetColor ();
			anarProvant = resposta == 's' || resposta == 'S';
			if (anarProvant) {
				console.clear(); console.println(); 
			}
		}

		console.println ("\n\n");
		//Console.SetCursorPosition (0, Console.WindowHeight-1);
		console.print ("Premeu qualsevol tecla per acabar");
		console.readKey (true);
		System.exit(0);
	}


	static int llegirEscaient (String msg, int min, int max, JConsole console) {
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
