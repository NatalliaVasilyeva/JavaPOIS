/* Необходимо ввести информацию о дне рождения. 
После чего будет получена информация о прожитых годах, днях, минутах, часах и секундах*/


import java.text.DateFormat;//подключаем бибилиотеку для преобразования строки в дату
import java.text.SimpleDateFormat; //библиотек для оппределия формата даты
import java.util.Date; //для создания объектов типа Date
import java.util.Scanner; //для ввода информации с клавиатуры в программу
import java.text.ParseException; // для ловли неправильного ввода даты


public class countOfLive {
 

    public static void main(String[] args) {

	// Вввод информации о дне рождения по частям
	    
	System.out.println("Input your date of birth, as:");
	
    	        int day = getInf("day");
		int month = getInf("month");
		int year = getInf("year");
		int hour = getInf("hour");
		int minute = getInf("minute");
                int second=0;
		
		String dateOfBirthInString = getFromIntToString(day, month, year, hour, minute, second); //преобразование введенных чисел в строчку для последующего преобразования в дату
	
	    System.out.println("Date of birth is " + dateOfBirthInString); // выводим сведения о дне рождения на экран
		
		Date dateOfNow = new Date(); // создание объекта типа Date
		
		try {
		DateFormat format = new SimpleDateFormat("dd.M.yyyy HH:mm:ss"); // определяем формат, в котором будет формироваться дата
			
		Date dateOfBirth = format.parse(dateOfBirthInString); // преобразование даты, представленной в строке,  в формат Date
			
                long substractionOfDate = Math.abs(dateOfBirth.getTime()-dateOfNow.getTime()); // определяем количество прожитых миллисекунд
		
		// выводим информацию на экран о прожитых годах, днях, минутах и пр.
			
                System.out.println("Your life in millisecond is " + substractionOfDate);
                System.out.println("Your life in second is " + substractionOfDate/1000);
                System.out.println("Your life in minute is " + substractionOfDate/1000/60);
                System.out.println("Your life in hour is " + substractionOfDate/1000/60/60);
                System.out.println("Your life in day is " + substractionOfDate/1000/60/60/24);
		System.out.println("Your life in month is " + substractionOfDate/1000/60/60/24/30);	
                System.out.println("Your life in years is " + substractionOfDate/1000/60/60/24/365);
		}
		catch (ParseException e) 
		{
			System.out.println("Mistake"); // ловим ошибки
			}
    }
	// метод, позволяющий вводить с клавиатуры информацию о дне рождения и записи ее в переменные
public static int getInf(String inf) {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Input information about " + inf + " of birth");
         String a = scan.nextLine();
	 return Integer.parseInt(a);
	  }
	  
	//метод преобразования целочисленных переменных в строковый формат
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
