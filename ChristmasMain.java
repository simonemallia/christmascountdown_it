import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ChristmasMain {

	public static void main(String[] args) throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		System.out.println("Benvenuto in Christmas Countdown v 0.01!");
		System.out.println("Seleziona cosa vuoi fare");
		System.out.println("1 - Avvia il countdown");
		System.out.println("2 - Credits");
		System.out.println("3 - Chiudi l'applicazione");
		
		Structure run = new Structure ();
		Scanner tastiera = new Scanner (System.in);
		String scelta = tastiera.nextLine(); 
		
		switch (scelta) {
		case "1":
			run.countdownwithsound();
			break;
		case "2":
			System.out.println("Developed by Simone Mallia. Thanks for using my application :)");
			break;
		case "3":
			System.exit(0);
		default:
			System.out.println("Input non ricosciuto. Ritenta");
		}
		
		
		
		
		

	}

}
