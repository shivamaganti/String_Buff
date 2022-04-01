
// Java program to ReverseString using StringBuilder
import java.lang.*;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		//String pal = "shiva";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String pal = sc.nextLine();
		StringBuffer sbr = new StringBuffer(pal);

		sbr.reverse();
		
		if(pal.contentEquals(sbr)) {
			System.out.println(pal + " is a palindrome.");
		}
		else {
			System.out.println(pal + " is not a palindrome.");
		}
	}


}
