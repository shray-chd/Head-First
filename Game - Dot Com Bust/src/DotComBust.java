import java.util.*;

public class DotComBust {

	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;
	
	private void setUpGame(){
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("etoys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");
		
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);
		
		System.out.println("Your goal is to sink the three Dot Coms");
		System.out.println("Pets.com, etoys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses");
		
		for (DotCom dotComSetUp : dotComList){
			
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComSetUp.setLocationCells(newLocation);
		}
	}

	private void startPlaying(){

		
		while(!dotComList.isEmpty())
		{
			String userGuess = helper.getUserInput("Enter a guess");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess (String guess){
		
		numOfGuesses++;
		String result = "miss";
		
		for (DotCom dotComToTest : dotComList){
			
			result = dotComToTest.checkYouSelf(guess);
			
			if(result.equals("hit")){
				break;
			}
			if(result.equals("kill")){
				dotComList.remove(dotComToTest);
				break;
			}
		}
		System.out.println(result);
	}
	
	private void finishGame(){
		
		System.out.println("All the Dot Coms are dead! Your stock is now worthless");
		
		if(numOfGuesses<=18){
			System.out.println("It only took you "+numOfGuesses+" guesses");
			System.out.println("You got out before yor options sank");
		}else{
			System.out.println("Took you long enough. "+numOfGuesses+" guesses");
			System.out.println("Fishes are dancing with your option.");
		}
	}

	public static void main(String[] args){
		
		DotComBust play = new DotComBust();
		play.setUpGame();
		play.startPlaying();
	}
}


