
import java.util.Scanner;
public class GettingUserinfo {
	public static void main(String[] args) {
		System.out.println("Taking Input from the user");
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter number 1");
		int a = sc.nextInt();
		System.out.println("enter number 2");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("the sum of these number is: " + sum); 
		boolean b1= sc.hasNextInt();
		System.out.println(b1); 
		String str =sc.nextLine();
		System.out.println(str);
		System.out.println("What is your name");
		String name = sc.next();
		System.out.println("hello "+ name + " have a good day");
		
		
		
	}
}
