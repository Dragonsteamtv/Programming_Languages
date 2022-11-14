package excercise;
import java.util.Scanner;

public class time {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input seconds: ");
		int seconds = scanner.nextInt();
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = seconds % 60;
		p2 = p2 / 60;
		System.out.println(p2 + ":" + p3 + ":" + p1);		
	}
}
