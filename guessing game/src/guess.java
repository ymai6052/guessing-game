import java.util.Scanner;
public class guess {
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
		int answer=(int)((Math.random())*10+1);
		Scanner guess=new Scanner(System.in);
		System.out.println("Try guessing the number");
		int x=guess.nextInt();
		System.out.println(answer);
		while(answer!=x)
		{
			int y=guess.nextInt();
			if(answer!=y)
			{
			System.out.println("Aw your answer is wrong.");
			}
			if(answer==y)
			{
			System.out.println("Yay you guessed the number.");
			}
		}
	}
}
