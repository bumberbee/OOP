//Viết chương trình để đếm số lượng ký tự là SỐ có trong chuỗi s. Chuỗi s được nhập từ bàn phím. 

package phan03;
import java.util.Scanner;
public class CountNumInString {
	
public static int countNumberInString(String chuoi) {
	int count =0;
	for(int i =0; i< chuoi.length(); i++) {
		char number = chuoi.charAt(i); // Doc qua tung phan tu 
		if(Character.isDigit(number)) { // duyet qua cac phan tu da doc
	//	if (!Character.isLetter(number))
			count ++;
		}
	}
	return count;
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter your string : ");
	String str = scanner.nextLine();
	int countString = countNumberInString(str);
	System.out.println(" There are " +countString+" is not AlphaBetic");
	scanner.close();
}
}
