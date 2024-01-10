package phan02;

public class ConditionalDemo {
public static void main(String[] args) {
	int value1 =1;
	int value2 = 2;
	int result;
	boolean someCondition = true;
	result = someCondition ? value1 : value2;// neu someCondition la true thi result03 nhanj gtri cua value1
											  //neu someCondition la false thi result03 nhan gtri cua value2
	System.out.println(result);
}
}
