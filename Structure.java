import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Structure {
	
	long now = System.currentTimeMillis();
	Calendar christmas = Calendar.getInstance();
	URL urlsound = getClass().getResource("jingle_bells.mid");
	
	
	public void countdownwithsound () throws InterruptedException, UnsupportedAudioFileException, IOException, LineUnavailableException {
		christmas.set(Calendar.MONTH, Calendar.DECEMBER);
		christmas.set(Calendar.DAY_OF_MONTH, 25);
		long untilChristmas = christmas.getTimeInMillis() - now;
	    Date date = new Date(untilChristmas);
	    SimpleDateFormat df = new SimpleDateFormat("DDD");
	    AudioInputStream audio = AudioSystem.getAudioInputStream(urlsound);
		Clip clip = AudioSystem.getClip();
		clip.open(audio);
	  	System.out.println("Mancano esattamente " + df.format(date) + " giorni al prossimo Natale!");
		System.out.println("       .     .                       *** **\n" + 
				"                !      .           ._*.                       .\n" + 
				"             - -*- -       .-'-.   !  !     .\n" + 
				"    .    .      *       .-' .-. '-.!  !             .              .\n" + 
				"               ***   .-' .-'   '-. '-.!    .\n" + 
				"       *       ***.-' .-'         '-. '-.                   .\n" + 
				"       *      ***$*.-'               '-. '-.     *\n" + 
				"  *   ***     * ***     ___________     !-..!-.  *     *         *    *\n" + 
				"  *   ***    **$** *   !__!__!__!__!    !    !  ***   ***    .   *   ***\n" + 
				" *** ****    * *****   !__!__!__!__!    !      .***-.-*** *     *** * #_\n" + 
				"**********  * ****$ *  !__!__!__!__!    !-..--'*****   # '*-..---# ***\n" + 
				"**** *****  * $** ***      .            !      *****     ***       ***\n" + 
				"************ ***** ***-..-' -.._________!     *******    ***      *****\n" + 
				"***********   .-#.-'           '-.-''-..!     *******   ****...     #\n" + 
				"  # ''-.---''                           '-....---#..--'****** ''-.---''-\n" + 
				"                  Merry Christmas                         # \n" + 
				"");
		clip.start();
		Thread.sleep(45000);
	}
	
	

}
