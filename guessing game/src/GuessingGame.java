/*
 * Yiren Mai
 * 9/26/17
 * GuessingGame
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
public class GuessingGame {
	public static void main(String[]args)
	{
		guessgame();
	}
	public static void name()
	{
		System.out.println("What is your name");
		Scanner input=new Scanner(System.in);
		String x=input.next();
		System.out.println("How do you do "+x);
		System.out.println("How old are you this year?");
		int y=input.nextInt();
		if(y>30)
		{
			System.out.println("wow you are old"+x);
		}
		else
		{
			System.out.println("You are pretty young "+x+" how is your youth?");
		}
	}
	
	public static void guessgame()
	{
		System.out.println("What is your name");
		Scanner input=new Scanner(System.in);
		String x=input.next();
		System.out.println("How do you do "+x);
		System.out.println("How old are you this year?");
		int y=input.nextInt();
		if(y>30)
		{
			System.out.println("wow you are old"+x);
		}
		else
		{
			System.out.println("You are pretty young "+x);
		}
		
		int answer=(int)((Math.random())*10+1);
		System.out.println("Try guessing a number between 1 and 10");
		int num=0;
		while(answer!=num)
		{
			Scanner guess=new Scanner(System.in);
			try
			{
				int xd=guess.nextInt();
				if(answer!=xd)
				{
				System.out.println("Aw your answer is wrong.");
				}
				if(answer==xd)
				{
				System.out.println("Yay you guessed the number.");
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("you have error "+e);
			}
			
		}
	}
}
