/* Необходимо ввести информацию о дате рождения.
   После чего программа посчитает, сколько лет, месяцев, дней, минут и секунд Вы прожили */

// подключаем необходимые библиотека для обработки дат, ввода информации с клавиатуры
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;



public class countOfLive1 {

    public static void main(String[] args) {

	
	System.out.println("Input your date of birth in format dd.MM.yyyy HH.mm.ss");// просьба ввести информацию о дате рождения в определенном формате
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine(); // внесение информации о дате рождения в строковую переменную date
        
        DateFormat format = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss"); // определяем формат представления даты
        try {
            Date parseDate = format.parse(date); // преобразовываем строчку с датой рождения в формат date
            Date nowdate = new Date(); // оздаем новую переменную для определения текущей даты
            long substruction = Math.abs(nowdate.getTime()-parseDate.getTime()); // количество прожитых миллисекунд
	        
	// вывод информации на экран о прожитых годах, месяцах, днях, минутах и секундах	
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
