import java.util.Scanner;

public class proMain9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên tâm:");
		String ten =sc.nextLine();
		System.out.println("Nhập x :");
		float x =sc.nextFloat();
		System.out.println("Nhập y:");
		float y =sc.nextFloat();
		System.out.println("Bán kính:");
		double banKinh =sc.nextDouble();
		sc.nextLine();
		sc.close();
		ToaDo toado = new ToaDo(ten, x, y);
		Cirlce hinhtron = new Cirlce(toado, banKinh);
		System.out.println(hinhtron.toString());
	}
}
