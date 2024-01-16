//Viết chương trình cho nhập vào 1 mảng và in ra giá trị lớn nhất và nhỏ nhất của mảng.


package phan03;
import java.util.Scanner;

public class MinMaxOfArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();

        
        int[] array = new int[size];

        
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

      
        int minValue = array[0];
        int maxValue = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        System.out.println("Minimum value in the array is: " + minValue);
        System.out.println("Maximum value in the array is: " + maxValue);

        scanner.close();
    }
}
