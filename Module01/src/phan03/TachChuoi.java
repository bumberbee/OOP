//Viết hàm tách chuỗi gốc thành chuỗi con. 

package phan03;
import java.util.Scanner;
public class TachChuoi {
	
public static void tachChuoiA(String chuoi) {
	String[] chuoiCon = chuoi.split("\\s+"); // tab, space , enter = \\s+
	for(String i : chuoiCon ) {
		System.out.println(i);
	}
}
	
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your strig : ");
	String chuoi = scanner.nextLine();
	System.out.print("Your string after split: \n");
	tachChuoiA(chuoi);
	scanner.close();
}
}
