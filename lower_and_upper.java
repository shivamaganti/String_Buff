import java.util.Scanner;
import java.lang.*;

public class lower_and_upper {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two String: ");
		String pal = sc.nextLine();
		String pal1 = sc.nextLine();
		String test;
		int len = pal.length();
		if(pal.charAt(len-1)== pal1.charAt(0)) {
			test = pal.substring(0,len-1).concat(pal1);

		}
		
		 else {
			 test = pal.concat(pal1);
		 }
	
		System.out.println(test);
		
		

}
}
