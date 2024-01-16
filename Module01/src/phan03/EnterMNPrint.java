package phan03;
import java.util.Scanner;

public class EnterMNPrint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter M: ");
        int m = scanner.nextInt();

        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        System.out.println("Inverted Right-Angle Triangle:");
        printInvertedRightAngleTriangle(m);

        System.out.println("\nRight-Angle Triangle:");
        printRightAngleTriangle(n);

        System.out.println("\nHollow Right-Angle Triangle:");
        printHollowRightAngleTriangle(m);

        scanner.close();
    }

    public static void printInvertedRightAngleTriangle(int m) {
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightAngleTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printHollowRightAngleTriangle(int m) {
        for (int i = m; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}





//import java.util.Scanner;
//
//public class EquilateralTrianglePatterns {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the size of the equilateral triangle: ");
//        int size = scanner.nextInt();
//
//        System.out.println("Equilateral Triangle:");
//        printEquilateralTriangle(size);
//
//        System.out.println("\nInverted Equilateral Triangle:");
//        printInvertedEquilateralTriangle(size);
//
//        System.out.println("\nHollow Equilateral Triangle:");
//        printHollowEquilateralTriangle(size);
//
//        scanner.close();
//    }
//
//    public static void printEquilateralTriangle(int size) {
//        for (int i = 1; i <= size; i++) {
//            // In khoảng trắng để dịch sang phải
//            for (int j = 1; j <= size - i; j++) {
//                System.out.print("  ");
//            }
//
//            // In sao để tạo hình tam giác
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println(); // Xuống dòng để in hàng mới
//        }
//    }
//
//    public static void printInvertedEquilateralTriangle(int size) {
//        for (int i = size; i >= 1; i--) {
//            // In khoảng trắng để dịch sang phải
//            for (int j = 1; j <= size - i; j++) {
//                System.out.print("  ");
//            }
//
//            // In sao để tạo hình tam giác ngược
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println(); // Xuống dòng để in hàng mới
//        }
//    }
//
//    public static void printHollowEquilateralTriangle(int size) {
//        for (int i = 1; i <= size; i++) {
//            // In khoảng trắng để dịch sang phải
//            for (int j = 1; j <= size - i; j++) {
//                System.out.print("  ");
//            }
//
//            // In sao hoặc khoảng trắng để tạo hình tam giác rỗng
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                if (k == 1 || k == 2 * i - 1 || i == size) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println(); // Xuống dòng để in hàng mới
//        }
//    }
//}
//
