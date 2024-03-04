package simple;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {

		int a;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		a=in.nextInt();
		if(a%2==0) {
			System.out.println("The Entered Number is Even");
		}
		else {
			System.out.println("The Given Number is Odd");
		}
		


	}

}
