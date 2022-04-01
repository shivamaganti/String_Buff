import java.util.Scanner;

public class first2numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String pal = sc.nextLine();sc.close();
		int n = pal.length();
		String pal1 = pal.substring(0, 2);
		
		for(int i=0;i<n;i++) {
			System.out.print(pal1);
		}
	}

}
