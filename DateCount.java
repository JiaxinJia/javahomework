import java.util.Date;

public class DateCount {

	public static void main(String[] args) {
		long t = 10000;
		Date date = new Date(t);
		printDate(t, date);
		t *= 10;
		for(int i = 0; i < 7; i++) {
			date.setTime(t);
			printDate(t, date);
			t *= 10;
		}	
	}
	public static void printDate(long t, Date date) {
		System.out.println(t + ": " + date.toString());
	}
}
