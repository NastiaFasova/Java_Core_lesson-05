package ua.lviv.lgs.task2_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 'h' for head and 't' for tail: ");
			String str = scan.nextLine();
			if (str.equals("h") || str.equals("t")) {
				System.out.println("You have chosen " + (str.equals("h") ? "head" : "tail"));
				@SuppressWarnings("unused")
				Random r = new Random();
			} else {
				System.out.println("You entered the wrong character...Try again");
			}
		}
	}
}
