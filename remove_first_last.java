import java.util.Scanner;

public class remove_first_last {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String pal = sc.nextLine();sc.close();
		String test;
		
		int n = pal.length();
		test = pal.substring(1,n-1);
		
		System.out.println(test);

	}

}
