import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;



public class countOfLive1 {

    public static void main(String[] args) {

	
	System.out.println("Input your date of birth in format dd.MM.yyyy HH.mm.ss");
	
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
        try {
            Date parseDate = format.parse(date);
            Date nowdate = new Date();
            long substruction = Math.abs(nowdate.getTime()-parseDate.getTime());
	        System.out.println(substruction); 
     
	 
    System.out.println("Your life in second: " + substruction/1000);
    System.out.println("Your life in minute: " + substruction/1000/60);
    System.out.println("Your life in hour: " + substruction/1000/60/60);
    System.out.println("Your life in day: " + substruction/1000/60/60/24);
	System.out.println("Your life in month: " + substruction/1000/60/60/24/12);
    System.out.println("Your life in years: " + substruction/1000/60/60/24/365);
        }
        catch(ParseException parseEx){
        parseEx.printStackTrace();
    }


              
               
    
    }
}