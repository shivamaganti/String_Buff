import java.util.Scanner;

public class Short_long {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String pal = sc.nextLine();//sc.close();
		int n = pal.length();
		String pal1 = sc.nextLine();//sc.close();
		int n1 = pal1.length();
		String test;
		
		if(n > n1) {
			test = pal1 + pal + pal1;
		}
		else {
			test = pal + pal1 + pal;
		}
		
		System.out.print(test);
	}

}
