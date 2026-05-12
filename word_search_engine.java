package JavaLectures;
import java.util.Scanner;
public class word_search_engine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String [] wordArray = {"wind","leer","pushy","lade","size",
				"sob","borrowing","list","perish","hoax",
				"sticks","seed","impel","large","male",
				"silent","quilt","sobbed","remarkable","fantastic",
				"wire","reflective","putrid","pushover","swing"};
		
		while(true) {
			System.out.print("Enter a word: ");
			String input = sc.nextLine();
			
			if(input.equals("1")) {
				System.out.println("The end.");
				break;
			}
			
			char first_letter = input.charAt(0);
			int count1 = 0;
		System.out.println("The same first letter: ");
		
		for(int i =0;i<wordArray.length;i++) {
			if (wordArray[i].charAt(0) == first_letter) {
				System.out.println(wordArray[i]);
				count1++;
			}
		}
		System.out.println("Number of words with the same first letter: " + count1);
		
		int count = 0;
        int longestLength = 0;
        int shortestLength = 9999999;
		String longestword = "";
		String shortestword = "";
        System.out.println("Words that contain " + input + ": ");
		
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].contains(input)) {
                System.out.println(wordArray[i]);

                count++;

                if (wordArray[i].length() > longestLength) {
                    longestLength = wordArray[i].length();
                    longestword = wordArray[i];
                }

                if (wordArray[i].length() < shortestLength) {
                    shortestLength = wordArray[i].length();
                    shortestword = wordArray[i];
                }
            }
        }
 
        System.out.println("Number of words that contain " + input +": " + count );
        if (count > 0) {
            System.out.println("Longest word length: " + longestLength);
            System.out.println("Shortest word length: " + shortestLength);
            System.out.println("Longest word: " + longestword);
            System.out.println("Shortest word: " + shortestword);
        } else {
            System.out.println("No words contain " + input + ".");
        }
        
        
		}
	}

}
