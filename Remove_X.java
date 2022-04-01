import java.util.Scanner;

public class Remove_X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String pal = sc.nextLine();//sc.close();
		String test;
		
		//check whether there is any x or not.
		if(pal.charAt(0) == 'X' || pal.charAt(pal.length()-1) ==  'X' || pal.charAt(0) == 'x' || pal.charAt(pal.length()-1) ==  'x') {
			test = pal.substring(1, pal.length()-1);
		}
		
		else {
			test = pal;
		}

		System.out.println(test);
	}

}
