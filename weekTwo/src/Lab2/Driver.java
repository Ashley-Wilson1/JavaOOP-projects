package Lab2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		WordProcessor wp = new WordProcessor();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println("Letters: "+wp.countLetters(sentence));
		System.out.println("Words: "+ wp.countWords(sentence));
		System.out.println("Length: "+ wp.getLength(sentence));
	}

}
