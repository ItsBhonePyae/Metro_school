package JavaLectures;
import java.util.Scanner;
public class square_cube {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("Enter a number.(note: must be between 1 and 50)");
		int num = sc.nextInt();
		
		if(num<0||num>50) {
			System.out.println("Out of the range.");
			
		}
		else {
			System.out.println("Original number: " + num);
			System.out.println("square: "+ Math.pow(num,2));
			System.out.println( "cube: "+Math.pow(num, 3));
		}
		
		
		
		}
	}

}
