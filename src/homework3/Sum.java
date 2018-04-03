import java.util.Scanner;

public class Sum {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		do {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}while(!(num1 < 0 && num2 < 0));		
	}
}