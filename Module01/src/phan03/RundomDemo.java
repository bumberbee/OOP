package phan03;
import java.util.Random;
public class RundomDemo {
public static void main(String[] args) {
	Random rd = new Random();
	int n = rd.nextInt();
    System.out.println("Num ran : " + n);
	}		
}

//int min = 1;
//int max = 40 ;
//Random r = new Random();
//int i1 = r.NextInt(max - min +1) + min;
//r.NextInt(max) sẽ trả về random giữa 0 với max
