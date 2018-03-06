/**
 * 
 */
package dannypiper.wanshowbingo;
import java.util.Arrays;
import java.util.Random;

import dannypiper.wanshowbingo.*;

/**
 * @author Danny
 *
 */
public class main {
	public static String[] BingoItems = {
			"Luke laughs really loud",
			"Luke Facepalms",
			"Luke says 'BYE' at the end of the stream",
			"Luke Quit / Fired joke",
			"Luke 'Do you care?'",
			"Luke 'Thats Hilarious!'",
			"Luke saying Frecschbuuks",
			"Luke pulls his hair back",
			"Linus pulls Luke's chair back into frame",
			"Luke pulls an article up on Linus' laptop",
			"Nintendo Switch news",
			"Luke Hosts",
			"Luke was Wrong",
			"'Okay Google / Alexa / Siri' trolling'",
			"Luke Pokemon Facts",
			"Luke Drops Something",
			"The show starts late",
			"Linus plays the intro randomly near the end",
			"Luke's chair is too high"
	};
	/**
	 * @param args
	 */
	public static boolean search(int[] array, int number) {
		for(int member:array) {
			if(member==number) {
				return true;
			}
		}
		return false;
	}
	
	public static String[] randomiseBingo() {
		String[] output = new String[9];	//Nine cards
		int[] alreadyChosen = new int[100];
		Random rand = new Random();
		int k = 0;
		for(int i=0;i<9;i++) {
			int  n = rand.nextInt(BingoItems.length-1);
			if(search(alreadyChosen,n)) {
				i--;
			} else {
				alreadyChosen[k] = n;
				output[k] = BingoItems[n];
				k++;
			}
		}
		return output;
	}
	
	public static void main(String[] args) throws InterruptedException {
		String[] Items = randomiseBingo();
		window Window = new window();		
		Window.init(Items);
		Window.main();
		System.out.print("Finished, program exiting.");
	}

}
