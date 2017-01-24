import java.util.ArrayList;
import java.util.Scanner;

public class Answers
	{
		static int counter = 0; 

	
		public static void main(String[] args)
		{
		Database.fill();
		
		Database.addPrizes();
		quiz(); 
		
	
		
	}	
	
		public static void quiz()
		{
			Scanner userInput= new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + " ! ");
			System.out.println(" ");
			System.out.println("Would you like to play a game answer yes or no in lower case");
			String input = userInput.nextLine(); 
			if(input.equals ("yes"))
				{
					System.out.println("Lets get started");
				}
			else 
				{
					System.out.println("please feel free to come back later");
				}
			System.out.println(" ");
			System.out.println("Would you like to see a list of prizes you might win in this game answer yes or no in lower case ? ");
			String response = userInput.nextLine();
			if(response.equals ("yes"))
				
				{ 
					for(String s : Database.prizes)
						{
							System.out.println(s);
						}
				}
			else 
				{
					System.out.println("Okay a suprise!");
				}
			
			System.out.println(" ");
			System.out.println("To win one a prize I am going to ask you a series of questions and you need to answer true or false in lower case lets get started!");
			System.out.println(" ");
			for(int i = 0; i < 12; i++)
				{
			Scanner userInput2= new Scanner(System.in);
			System.out.println( Database.flashcard.get(0).getQuestion());
			System.out.println(" ");
			String answer= userInput2.nextLine();
			System.out.println(Database.flashcard.get(0).isAnswer());
			System.out.println(" ");
			if(answer.equals(Database.flashcard.get(0).isAnswer()))
				
				{ 
					System.out.println("That is correct! ");
					counter++;
				}

			else 
				
				{
					System.out.println("That is wrong ");
				}
			Database.flashcard.remove(0);
			
			
					
				}
			System.out.println("you got " + counter + " right");
			
				
			
			
			
			
			
			
			
					if(counter < 2)
						{
							System.out.println(" You did not get enough questions right to win a prize ");
						}
					else if (counter < 6 )
						{
							System.out.println("Congrats you have won a prize");
							System.out.println(Database.prizes.get(0));
							
						}
					else
						{
							System.out.println("Congrats you have won two prizes");
							System.out.println(Database.prizes.get(0));
							Database.prizes.remove(0);
							System.out.println(Database.prizes.get(0));
							
						}
					
				

			
			
			
		}

	}
