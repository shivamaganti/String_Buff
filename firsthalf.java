import java.util.Scanner;

public class firsthalf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String pal = sc.nextLine();sc.close();
		int n = pal.length();
		String test;
		
		if(n % 2 == 0) {
			test = pal.substring(0, n/2);
		}
		else {
			test = null;
		}

		System.out.println(test);
	}

}
