import java.util.Scanner;
public class NumberOne { 

	public static void main(String[] args) {
	   
		Scanner keyboard = new Scanner(System.in); //creates a Scanner object
		int num = keyboard.nextInt(); //reads in num from user
		
		while (num < 0 || num > 100){
		   System.out.println("Number outside of range. Try again");
		   num = keyboard.nextInt();
		}
	}
}