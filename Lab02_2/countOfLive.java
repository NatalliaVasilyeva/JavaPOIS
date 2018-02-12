import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;



public class countOfLive {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
        try {
            Date parseDate = format.parse(date);
            Date nowdate = new Date();
            long substruction = Math.abs(nowdate.getTime()-parseDate.getTime());
	        System.out.println(substruction); 
     
	 
            System.out.println(substruction/1000);
            System.out.println(substruction/1000/60);
            System.out.println(substruction/1000/60/60);
            System.out.println(substruction/1000/60/60/24);
            System.out.println(substruction/1000/60/60/24/365);
        }
            catch(ParseException parseEx){
            parseEx.printStackTrace();
    }
    
    }
}
