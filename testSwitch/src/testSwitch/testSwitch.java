package testSwitch;

import java.util.Scanner;

public class testSwitch {
	
	static Scanner Input= new Scanner(System.in);

	public static void main(String[] args) {
		menu();

	}

	private static void menu() {
		System.out.println("Please enter a number between 1 and 3");
		int choice= Input.nextInt();
	
			switch(choice) {
			case 1: {
				System.out.println("Number 1 chosen");
				menu();
				break;	
			}
			case 2: {
				System.out.println("Number 2 chosen");
				menu();
				break;	
				}
			case 3: {
				System.out.println("Number 3 chosen");
				menu();
				break;	
			}
			default: {
				System.out.println("You must choose between 1 and 3.");
				menu();
		}
		
		}
	}

}
