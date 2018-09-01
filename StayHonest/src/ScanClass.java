import java.util.ArrayList;
import java.util.Scanner;
public class ScanClass {
	private ArrayList<String> goals = new ArrayList<String>();
	
	public void start() {
		boolean stop = false;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a goal: (Press Q then hit Enter to Quit)");
		String firstGoal = reader.next();
		if(firstGoal.equals("Q") || firstGoal.equals("q")) {
			System.out.println("Here");
			stop = true;
			reader.close();
		}
		goals.add(firstGoal);
		while(!stop) {
			System.out.println("Another goal? (Press Q then hit Enter to Quit)");
			firstGoal = reader.next();
			if(firstGoal.equals("Q") || firstGoal.equals("q")) {
				stop = true;
				reader.close();
			}
			else if(!stop){
				goals.add(firstGoal);
			}
		}
	}
	public ArrayList<String> getGoals(){
		return goals;
	}
	
}
