package Important_stuff;
import java.util.Scanner;
import java.util.Random;

public class Common_key {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a text.");
		String input = sc.nextLine();
		System.out.println("Determine whether you gonna use the prime or random number: ");
		String prime_or_random = sc.nextLine();
		int[] result_arr = ascii(input);
		int [] encryption_key = new int[input.length()];
		
		//Selection of random number or prime number
		if(prime_or_random.contains("random")) { //random number
			encryption_key = key(result_arr);	
		}
		else if(prime_or_random.contains("prime")){ //prime number
			System.out.println("Determine the range(primes below this number whill be used): ");
			int range = sc.nextInt();

			for(int i=0;i<input.length();i++) {
			encryption_key[i] = prime_generator(range);
				}		
		}
			
		// This is where magic happens
		int[] encrypted;
		encrypted = new int[result_arr.length];
		
		for(int i=0;i<result_arr.length;i++) {
			encrypted[i] = result_arr[i]*encryption_key[i];
			
			}
		
		System.out.print("Symmetric key: ");
		for(int i=0;i<result_arr.length;i++) {
			System.out.print( encryption_key[i]+", " );
			
			}
		System.out.print("\nEncrypted data: ");
		for(int i=0;i<result_arr.length;i++) {
			System.out.print( encrypted[i]+", " );
			
			}	
		}
	
	// random number generator
	public static int[] key(int[] arr) {
		Random random = new Random();
		int[] key = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			key[i] = (int) random.nextInt(9999999);
		
		}
		return key;
	}
	
	// ASCII value are obtained 
	public static int[] ascii(String input) {
		
		char[] input_arr = input.toCharArray(); 		
		
		int[] asc;
		asc = new int[input_arr.length];
		for(int i=0;i<input_arr.length;i++) {
			
			int ascii = input_arr[i];
			asc[i] = ascii;	
		}
	return asc;	
	}

	// prime generator(one prime number for one character)
	public static int prime_generator(int term) {
	
		int term_index=0;
		int num=2;
		int[] prime_arr = new int[term];
		 		 
		 while(num<term){
		 int div = 2;
		 while(div<num) {
			 if(num % div==0)
				 break;
			 div++;
		 }
		 if(num==div) {
			 prime_arr[term_index++]= num;
		 }
		 num++;
		 }
	
		 Random ran = new Random();
		 int random_index = ran.nextInt(term_index);
		 term = prime_arr[random_index];

		return term;
	
	}
}
