package phan03;
import java.util.Scanner;

public class FoundKInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        // tạo mảng
        int[] array = new int[size];

      
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        
        System.out.println("Enter the value k : ");
        int k = scanner.nextInt();

        
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == k) {
                found = true;
                break;
            }
        }

        
        if (found) {
            System.out.println("Value " + k + " is found");
        } else {
            System.out.println("Value " + k + " is not found");
        }

        scanner.close();
    }
}
