import java.util.ArrayList;
import java.util.Scanner;
public class ScanClass {
	private ArrayList<String> goals = new ArrayList<String>();
	
	public void main() {
		boolean stop = false;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a goal: ");
		String s = reader.next();
		goals.add(s);
		while(!stop) {
			System.out.println("Another goal? (Press Q then hit Enter to Quit)");
			if(s == "Q" || s == "q") {
				stop = true;
				reader.close();
			}
			else {
				goals.add(s);
			}
		}
	}
	private ArrayList<String> getGoals(){
		return goals;
	}
	
}
