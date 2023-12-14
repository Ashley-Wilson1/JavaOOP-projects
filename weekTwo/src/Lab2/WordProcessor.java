package Lab2;

public class WordProcessor implements Counter{
		@Override
		public int countWords(String sentence) {
			return sentence.split(" ").length;
		}

		@Override
		public int countLetters(String sentence) {
			int counter = 0;
			
			for(int i =0;i<sentence.length();i++) {
				if(Character.isLetter(sentence.charAt(i)))
					counter++;
				
			}
			return counter;
		}

		@Override
		public int getLength(String sentence) {
			
			return sentence.length();
		}
	}
