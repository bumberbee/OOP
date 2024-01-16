//Viết chương trình tìm USCLN của 2 số nhập vào.

package phan03;
import java.util.Scanner;
public class UCLN {
	
public static int USCLN(int num1, int num2) {
	while(num2!=0) {
		int temp = num2;
		num2 = num1 % num2;
		num1 = temp;
	}
	return num1;
}		
	
	
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a: ");
	int num1 = scanner.nextInt();
	
	System.out.println("Enter b: ");
	int num2 = scanner.nextInt();
	
	
	
	int result = USCLN(num1, num2);
	System.out.println("Result : " + result);
	
	scanner.close();
	}
}
