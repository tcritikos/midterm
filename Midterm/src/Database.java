import java.util.ArrayList;
import java.util.Collections;

public class Database
	{
		static ArrayList<Question> flashcard = new ArrayList<Question>(); 
		static ArrayList<String> prizes = new ArrayList <String>();
		public static void fill()
		{
		
		flashcard.add(new Question( "The coach of the Denver Broncos is Vance Joesef?" ," true"));
		flashcard.add(new Question( "Twinkies Last forever" , "false"));
		flashcard.add(new Question( "Chipotle was founded in Colorado?" , "true"));
		flashcard.add(new Question( "Napolean Bonaparte was very short for the time period he livd in?" , "false"));
		flashcard.add(new Question( "The mascot of Mullen High School Is a Mustang?" , "true"));
		flashcard.add(new Question( "There is more bacteria than cells in your body?" ," true"));
		flashcard.add(new Question( "Humans can breathe and swallow at the same time?" ," false"));
		flashcard.add(new Question( "Birds are dinosuars?" , "true"));
		flashcard.add(new Question( "Your fingernails grow after you die?" , "false"));
		flashcard.add(new Question( "Oxford College is older than the Aztec empire?" , "true"));
		flashcard.add(new Question( "Chocoalte chip cookies are older than oreos?" , "false"));
		flashcard.add(new Question( "The fax machine was invented in the 1900's?" , "false"));
		flashcard.add(new Question( "Lightining never strikes the same place twice?" , "true"));
		flashcard.add(new Question( "Nasa grew a flower in space?" , "true"));
		flashcard.add(new Question( "Humans grow a new stomach lining every three to four days?" , "true"));
		flashcard.add(new Question( "An american was the first person in space?" , "false"));
		Collections.shuffle(flashcard);
		}
		
		public static void addPrizes()
		{
			prizes.add("Black BMW");
			prizes.add("One Hundred Thousand Dollars");
			prizes.add("Broncos Tickets");
			prizes.add("Microwave");
			prizes.add("White Mustang");
			prizes.add("One Hundred Dollars");
			prizes.add("Nuggets Tickets");
			prizes.add("Oven");
			prizes.add("Red Audi");
			prizes.add("Twenty Thousand Dollars");
			prizes.add("Avalanche Tickets");
			prizes.add("Washing Machine");
			Collections.shuffle(prizes);
		
			
			
		}

	}
