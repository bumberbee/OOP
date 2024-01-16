// Viết chương trình in ra 10 sỗ chẵn đầu tiên

package phan03;
public class SumOf10FirstEvenNum {
	
	
public static void main(String[] args) {
	
	 int sum =0;
	for(int i =0; i<=10; i+=2) {
		if(i % 2 == 0) {
			sum += i;
		}
	}
	System.out.println(" Sum of ten first odd number: " +sum);
}
}
