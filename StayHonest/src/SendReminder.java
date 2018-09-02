import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;       
         
public class SendReminder {
	public static void getCurrentTime() {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
	}
	public static void waitingSequence() {
		boolean toStop = true;
		while(toStop) {
			if() {
				
			}
		}
	}
}
