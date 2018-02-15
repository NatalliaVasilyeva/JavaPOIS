import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;


public class countOfLive {
 

    public static void main(String[] args) {

	System.out.println("Input your date of birth, as:");
	
    	        int day = getInf("day");
		int month = getInf("month");
		int year = getInf("year");
		int hour = getInf("hour");
		int minute = getInf("minute");
                int second=0;
		
		String dateOfBirthInString = getFromIntToString(day, month, year, hour, minute, second); 
	
	    System.out.println("Date of birth is " + dateOfBirthInString);
		
		Date dateOfNow = new Date();
		
		try {
		DateFormat format = new SimpleDateFormat("dd.M.yyyy HH:mm:ss");
			
		Date dateOfBirth = format.parse(dateOfBirthInString);
			
                long substractionOfDate = Math.abs(dateOfBirth.getTime()-dateOfNow.getTime());
			
                System.out.println("Your life in millisecond is " + substractionOfDate);
                System.out.println("Your life in second is " + substractionOfDate/1000);
                System.out.println("Your life in minute is " + substractionOfDate/1000/60);
                System.out.println("Your life in hour is " + substractionOfDate/1000/60/60);
                System.out.println("Your life in day is " + substractionOfDate/1000/60/60/24);
                System.out.println("Your life in years is " + substractionOfDate/1000/60/60/24/365);
		}
		catch (ParseException e) 
		{
			System.out.println("Mistake");
			}
    }
public static int getInf(String inf) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Input information about " + inf + " of birth");
         String a = scan.nextLine();
	 return Integer.parseInt(a);
	  }
	  
private static String getFromIntToString(int day, int month, int year, int hour, int minute, int second){
	StringBuilder datushka = new StringBuilder();
	datushka.append(day).append(".");
	datushka.append(month).append(".");
	datushka.append(year).append(" ");
	datushka.append(hour).append(":");
	datushka.append(minute).append(":");
	datushka.append(second).append("00");
	
	return datushka.toString();
}
	
}  
