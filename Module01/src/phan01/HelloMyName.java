package phan01;
import java.util.Scanner;
public class HelloMyName {
	public static void main(String[] args) {
		// Scanner to enter your name
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		//Doc ten nguoi nhap va luu vao "ten"
		String name = scanner.nextLine();
		scanner.close();
		System.out.println("Hello " +name);
		
	}
}