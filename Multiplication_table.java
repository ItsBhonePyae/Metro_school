package JavaLectures;

import java.util.Scanner;
public class Multiplication_table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int num  = sc.nextInt();
		int[] arr = new int[13];
		
		for(int i = 0;i<13;i++) {
			int mul = num * i;
			arr[i] = mul;
			
		}
		for(int i= 0;i<13;i++) {
			System.out.println(num +" * " +i+" = "+ arr[i]);
		}
		
		
		
	}

}
