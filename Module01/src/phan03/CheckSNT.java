//Viết chương trình kiểm tra số nhập vào có phải là số nguyên tố hay không.

package phan03;

import java.util.Scanner;
public class CheckSNT {
	
public static boolean SNT(int a) {
	if(a <=1) 
	{
		return false;
	} else 
	{
		for(int i = 2; i<= Math.sqrt(a);i++) {
			if(a % i == 0) {
				return false;
			}
		}
	return true;
		
	}
		
}
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter number: ");
	int a = scanner.nextInt();
	
	if(SNT(a)) {
		System.out.println( a + " Là số nguyên tố");
	}else {
		System.out.println( a + " Không là số nguyên tố");
	}
	scanner.close();
	
		}
}
