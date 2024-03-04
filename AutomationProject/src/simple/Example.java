package simple;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		String username;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");

		username = sc.nextLine();

		switch(username) {

		case  "Stalin":
			System.out.println("Hi " + username);
			break;

		case "Ram":
			System.out.println("Hi " + username);
			break;

		case "Akash":
			System.out.println("Hi " + username);
			break;

		case "Mickey":
			System.out.println("Hi " + username);
			break;

		default:
			System.out.println("Your name is not in the list");
		}

	}

}
