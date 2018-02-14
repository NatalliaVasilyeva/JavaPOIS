import java.util.Scanner;


public class Lab02_1{

public static void main (String[] args) {
	
	System.out.println("Интерактивное приложение, запрашивающее информацию");
	System.out.println("о человеке: его имени, дне рождения, месте работы");
	System.out.println("должности, семейном положении и детях");
	System.out.println("а также о хобби и увлечениях, любимом афоризме или цитате");
	System.out.println("");
	System.out.println("================================================================");
	System.out.println("");
	
	
	String name = "";
	String dateOfBirth = "";
	String job = "";
	String position = "";
	String maritalStatus = "";
	int children = 0;
	String hobby = "";
	String aphorism = "";
	
	Scanner scanner = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Input your name");
	name = scanner.nextLine();
	System.out.println("Input your date of birth");
	dateOfBirth = scanner.nextLine();
	System.out.println("Input your place of work");
	job = scanner.nextLine();
	System.out.println("Input your position at work");
	position = scanner.nextLine();
	System.out.println("Input your marital status");
	maritalStatus = scanner.nextLine();
	
	System.out.println("How much children do have?");
	children = sc.nextInt();
		
	System.out.println("What is your hobbies?");
	hobby = scanner.nextLine();
	System.out.println("What is your favorite aphorism?");
	aphorism = scanner.nextLine();
	System.out.println(" ");
	System.out.println("=============================================================== ");
	System.out.println(" ");
	
	System.out.println("Your name is " + name);
	System.out.println("Your date of birth is " + dateOfBirth);
	System.out.println("Your place of work is " + job);
	System.out.println("Your position at work is " + position);
	System.out.println("Your marital status is " + maritalStatus);
	System.out.println("You has " + children + " children");
	System.out.println("Your hobbies is " + hobby);
	System.out.println("Your favorite aphorism is " + aphorism);
	System.out.println(" ");
    System.out.println("===============================================================");
}
}
