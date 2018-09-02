import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//This is me
public class ScanClass {
	private ArrayList<String> goals = new ArrayList<String>();
	
	public void start() throws IOException {
		boolean stop = false;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a goal: (Press Q then hit Enter to Quit)");
		String firstGoal = reader.readLine();
		if(firstGoal.equals("Q") || firstGoal.equals("q")) {
			System.out.println("Here");
			stop = true;
			reader.close();
		}
		goals.add(firstGoal);
		while(!stop) {
			System.out.println("Another goal? (Press Q then hit Enter to Quit)");
			firstGoal = reader.readLine();
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
