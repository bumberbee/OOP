//Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.

package phan03;
import java.util.Scanner;

public class Countsyntax {
	
public static int count(String chuoi) {
	int count =0;
	for(int i=0; i< chuoi.length(); i++) {
		if(chuoi.charAt(i) == 'a') {
			count ++;
		}
	}
	return count;
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter string: ");
	String chuoi = scanner.nextLine();
	int Sokitu = count(chuoi);
	System.out.println("So ki tu a xuat hien : " + Sokitu);
	scanner.close();
	
	
}
}
