package phan03;
import java.util.Random;
public class RundomDemo {
public static void main(String[] args) {
	int min = 1;
	int max = 40 ;
	Random r = new Random();
	int stt = r.nextInt(max - min +1) + min;
	System.out.println(stt);
	//r.NextInt(max)
	}		
}





//Random rd = new Random();
//int n = rd.nextInt();
//System.out.println("Num ran : " + n);