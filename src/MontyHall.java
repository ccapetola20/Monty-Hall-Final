import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Casey Capetola
 *
 */
public class MontyHall 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Scanner user = new Scanner(System.in);
		
		int hidDoor = rand.nextInt(3) + 1;
		System.out.print("Which door would you like to pick: ");
		int doorOne = Integer.parseInt(user.nextLine());
		int goatDoor = 6-hidDoor-doorOne;
		
		if(hidDoor==1 && doorOne==1)
		{
			int goatOne = rand.nextInt(2);
			
			if(goatOne==0)
			{
				System.out.println("There is a goat behind Door #3");
				System.out.print("Would you like to change your pick?");
				String answerUno = user.nextLine();
				
				if(answerUno.equals("yes"))
				{
					System.out.println("\nThe car was behind Door #1!");
					System.out.println("You lost!");
				}
				else if(answerUno.equals("no"))
				{
					System.out.println("\nThe car was behind Door #1!");
					System.out.println("You won!");
				}
				else
				{
					System.out.println("\nYour response is invalid");
				}
			}
			else
			{
				System.out.println("There is a goat behind Door #2");
				System.out.print("Would you like to change your pick?");
				String answerDos = user.nextLine();
				
				if(answerDos.equals("yes"))
				{
					System.out.println("\nThe car was behind Door #1!");
					System.out.println("You lost!");
				}
				else if(answerDos.equals("no"))
				{
					System.out.println("\nThe car was behind Door #1!");
					System.out.println("You won!");
				}
			}
		}
		else if(hidDoor==2 && doorOne==2)
		{
			System.out.println("There is a goat behind Door #3");
			System.out.print("Would you like to change your pick? ");
			String answerTwo = user.nextLine();
			
			if(answerTwo.equals("yes"))
			{
				System.out.println("\nThe car was behind Door #2!");
				System.out.println("You lost!");
			}
			else if(answerTwo.equals("no"))
			{
				System.out.println("\nThe car was behind Door #2!");
				System.out.println("You won!");
			}
			else
			{
				System.out.println("\nYour response is invalid");
			}
		}
		else if(hidDoor==3 && doorOne==3)
		{
			System.out.println("There is a goat behind Door #1");
			System.out.print("Would you like to change your pick? ");
			String answerThree = user.nextLine();
			
			if(answerThree.equals("yes"))
			{
				System.out.println("\nThe car was behind Door #3!");
				System.out.println("You lost!");
			}
			else if(answerThree.equals("no"))
			{
				System.out.println("\nThe car was behind Door #3!");
				System.out.println("You won!");
			}
		}
		else if(hidDoor!=doorOne)
		{
			System.out.println("There is a goat behind Door #" + goatDoor);
			System.out.print("Would you like to change your pick? ");
			String answer = user.nextLine();
			
			if(answer.equals("yes"))
			{
				int doorTwo = 6-goatDoor-doorOne;
				
				if(doorTwo==hidDoor)
				{
					System.out.println("\nThe car was behind Door #" + hidDoor + "!");
					System.out.println("You won!");
				}
				else
				{
					System.out.println("\nThe car was behind Door #" + hidDoor + "!");
					System.out.println("You lost!");
				}
			}
			else if(answer.equals("no"))
			{
				if(doorOne==hidDoor)
				{
					System.out.println("\nThe car was behind Door #" + hidDoor + "!");
					System.out.println("You won!");
				}
				else
				{
					System.out.println("\nThe car was behind door #" + hidDoor + "!");
					System.out.println("You lost!");
				}
			}
			else
			{
				System.out.println("\nYour response is invalid");
			}
		}
		
		else
		{
			System.out.print("Your guess is invalid.");
		}

	}

}
