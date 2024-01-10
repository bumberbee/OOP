package phan03;

import java.util.Scanner;

public class SumOfOddEvenNum {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		sc.close();
		int sum;
		if(n%2 == 0) {
			sum = calculateEvenSum(n);
			System.out.println("Sum of even sum is : " +sum);
		}else{
			
			sum=calculateOddSum(n);
				System.out.println("Sum of odd sum is : " +sum);
		}
	
	
	
}
//Hàm tính tổng số lẻ
private static int calculateOddSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i = i + 2) {
        sum += i;
    }
    return sum;
}

// Hàm tính tổng số chẵn
private static int calculateEvenSum(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i = i + 2) {
        sum += i;
    }
    return sum;
}
}
