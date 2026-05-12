package JavaLectures;
import java.util.Scanner;


public class valid_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.print("Enter the code: ");
		String input = sc.nextLine();
		
		if(isvalid(input)) {
			System.out.println("The code is valid.");
		}
		else {
			System.out.println("You might have to check again.");
		}
		}
	}
	public static boolean isvalid(String code) {
		boolean alphabet=false;
		boolean number=false;
		boolean special=false;
		
		if(code.length()<10||code.length()>10) {
			return false;
		}
		
		char[] code_arr = code.toCharArray();
		int[] asc = new int[code_arr.length];
		for(int i=0;i<code_arr.length;i++) {
			
			int ascii = code_arr[i];
			asc[i] = ascii;
			
		}
		
		for(int i=0;i<4;i++) {
			if(asc[i]>=65&&asc[i]<91||asc[i]>=97&&asc[i]<123) {
				alphabet=true;
			}
		}
		
		for(int i= 4;i<8;i++) {
			if(asc[i]>=48&&asc[i]<58) {
				number=true;
			}
		}
		
		for(int i=8;i<10;i++) {
			if(asc[i]==33||asc[i]==64||asc[i]>=35&&asc[i]<39) {
				special=true;
			}
		}
		
		if(!alphabet) {
			return false;
		}
		if(!number) {
			return false;
		}
		if(!special) {
			return false;
		}
		
		return true;
	}
	
	
	
}
