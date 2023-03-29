package positivenegative;
import java.util.Scanner;
public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a>0) {
			System.out.println("The number is positive");
		} else {
			System.out.println("The number is negative");
		}
		
	}

}
