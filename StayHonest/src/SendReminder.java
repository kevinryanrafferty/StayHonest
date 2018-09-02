import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;       
         
public class SendReminder {
	public static String getCurrentTime() {    
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");  
		LocalDateTime now = LocalDateTime.now();  
		String time = dtf.format(now);
		return time;  
	}
	public static void waitingSequence() {
		boolean toStop = true;
		String userTime = "15:42";
		while(toStop) {
			String time = getCurrentTime();
			if(time.equals(userTime)) {
				System.out.println("IM A GOAL");
			}
		}
	}
}
