// Jalena Austin

// I assert that I have written 100% of this code myself otherwise
// I will receive a 0% grade on this assignment.
//
// Status:
//
// This code is 100% tested and correct
import java.util.*;
public class morse {

	public static void main(String[] args) {
		
		char[] capLetters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
		                    'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
		                    'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
				"..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
				"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
		
		Scanner inputScan = new Scanner(System.in);
		boolean anotherWord = true;;
		while (anotherWord) {
			String userMorseCode = inputScan.nextLine();
			String[] wordLetter = userMorseCode.split(" ");	
			
			if (userMorseCode.equals("-----")) {
				anotherWord = false;
			}
			
			else {
	 			for(int i = 0; i < wordLetter.length; ++i) {
					for (int j = 0; j < morseCode.length; ++j) {
						if (wordLetter[i].compareTo(morseCode[j]) == 0) {
							System.out.print(capLetters[j]);
							if (wordLetter[i].equals("")) {
								i++;
							}
						}
					}
					System.out.print(" ");
	 			}
			}
		}
	}
}