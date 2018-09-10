
package controller;

import java.util.Scanner;

public class NewNewController 
{
	
	public void start()
	{
		questions();
		
		moreInput();
		
	}
	private void questions()
	{
		System.out.println("what is your favorite color?");
		Scanner inputScanner = new Scanner(System.in);
		
		String answer = inputScanner.nextLine();
		System.out.println(answer);
		
		System.out.println("what is your favorite number?");
		int answer4 = inputScanner.nextInt();
		System.out.println(answer4);
		
		
		inputScanner.close();
		
	}
 	
	public void moreInput()
	{
		Scanner textScanner; //This is a declaration of a Scanner variable.
		
		textScanner = new Scanner(System.in); //Initialization of the textScanner variable.
		
		System.out.println("Type in your irrational number");
		
		int userNumber = textScanner.nextInt();
		
		System.out.println("Your favorite irrational  number is: " + userNumber);
		
		textScanner.close();
		
	}
}

