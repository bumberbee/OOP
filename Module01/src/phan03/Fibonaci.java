//Viết chương trình nhập vào số nguyên n và thực hiện: Xuất ra màn hình n số đầu tiên của chuỗi 
//Fibonaci (có hai giá trị đầu là 1 và 1).



package phan03;
import java.util.Scanner;
public class Fibonaci {  
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter n: ");
	        int n = scanner.nextInt();

	        if (n <= 0) {
	            System.out.println("Enter n (n>0) : ");
	        } else {
	            System.out.println("Dãy Fibonaci( có giá trị đầu-cuối bằng 1 gồm " + n + " số đầu tiên là:");
	            printFibonacci(n);
	        }

	        scanner.close();
	    }

	    public static void printFibonacci(int n) {
	        int firstNumber = 1;
	        int secondNumber = 1;

	        System.out.print(firstNumber + " " + secondNumber + " ");

	        for (int i = 2; i < n; i++) {
	            int nextNumber = firstNumber + secondNumber;
	            System.out.print(nextNumber + " ");

	            firstNumber = secondNumber;
	            secondNumber = nextNumber;
	        }
	    }
	}

	

