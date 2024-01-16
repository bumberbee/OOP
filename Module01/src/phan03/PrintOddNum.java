//Viết chương trình in ra những số lẻ từ 1 đến 99.

package phan03;
//import java.util.Scanner;
public class PrintOddNum {
	
	
	
public static void main(String[] args) {
// n NHẬP TỪ BÀN PHÍM :
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter n: ");
//	int n = scanner.nextInt();
//	int sumOddNum = 0;
//	for(int i =0; i<n; i++) {
//		if( i % 2 != 0 ) {
//			sumOddNum += i;
//		}
//	}
//	scanner.close();
	
	int sumOddNum = 0;
	for(int i =0; i< 99; i+=2) {
		sumOddNum += i;
	}
	System.out.println("Sum of odd number from 1  to 99 :  " + sumOddNum);
}
}
