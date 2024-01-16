package phan03;

import java.util.Scanner;

public class EnterStringToArrayAndCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

       
        String[] stringArray = new String[size];

       
        System.out.println("Enter the strings of the array: ");
        for (int i = 0; i < size; i++) {
            stringArray[i] = scanner.next();
        }

        // Nhập chuỗi cần kiểm tra
        System.out.println("Enter the string to search: ");
        String searchString = scanner.next();

        // Kiểm tra xem chuỗi có tồn tại trong mảng hay không
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (stringArray[i].equals(searchString)) {
                found = true;
                break;
            }
        }

        // Xuất kết quả
        if (found) {
            System.out.println("String '" + searchString + "' is found");
        } else {
            System.out.println("String '" + searchString + "' is not found");
        }

        scanner.close();
    }
}
