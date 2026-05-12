package JavaLectures;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("Enter a text.");
		String txt = sc.nextLine();
		
		
		char[] txt_arr = txt.toCharArray();
		char vowels[] = {'a','e','i','o','u','A','E','I','O','U'};
		int vowels_count=0;
		int space_count =0;
		int words_count=0;
		for (int i = 0;i <txt_arr.length;i++) {
			
			for (int j = 0;j<10;j++) {
				if(txt_arr[i]==vowels[j]) {
					vowels_count++;
				}
			}
		}
		for (int i = 0;i <txt_arr.length;i++) {
			
			if(txt_arr[i]==' ') {
				space_count++;
			}
			
			if(txt_arr[i]!=' ') {
				words_count++;
			}
			
			}
		int words = space_count+1;	
		int con = words_count-vowels_count;
		System.out.println("Number of vowels = "+vowels_count);	
		System.out.println("Number of consonants = "+con);	
		System.out.println("Number of space = "+space_count);		
		System.out.println("Number of words = "+words);	
	}
		
		
	}

}

