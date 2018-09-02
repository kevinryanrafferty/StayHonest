import java.io.IOException;
import java.util.ArrayList;


public class main {
	private static ScanClass userInput;
	
	private static SendReminder reminder;
	public static void main(String[] args) throws IOException {
		userInput = new ScanClass();
		userInput.start();
		ArrayList<String> goals = userInput.getGoals();
		reminder = new SendReminder();
		reminder.waitingSequence();
		System.out.println(goals);
	}
	
	private ArrayList<String> add(){
		userInput = new ScanClass();
		ArrayList<String> goals = userInput.getGoals();
		return goals;

	}
	
	/*First we need a list of strings from the user. 
	Tasks
	1. Take in user input
	2. Update current goals list with user input (maybe later save to actual files so you dont lose goals when app is closed)
	3. Send out a random reminder at a certain Time.class (future let user set reminder time)
	4. Create a reminded and not reminded list. When an reminder is sent, move a reminder to the reminded list. When the not reminded list is empty, make the reminded list the non reminded list. 
	Before you put the reminded list check it agaisnt the current and delete goals that arent there. 
	5. */
}
