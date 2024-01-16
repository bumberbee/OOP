//Tính tổng các số nguyên tố nhỏ hơn N.

package phan03;
import java.util.Scanner;
public class SumSNT {
public static boolean CheckSNT(int n) {
	
	if (n<=1) {
		return false;
	}
	else {
		for(int i = 2; i<= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
	
	

public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter n: ");
	int n = scanner.nextInt();
	
	int sum=0;
	for(int i = 2; i< n; i++) {
		if(CheckSNT(i)) {
			sum += i;
		}

	}
	System.out.println("Tổng các số NT nhỏ hơn " +n+ " : "  + sum);
	scanner.close();
	}
}
