import java.util.Scanner;

public class Concat_two_strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String res="";
		 //same
		 if(s1.length()==s2.length())
		 {
		 for(int i=0;i<s1.length();i++)
		 {
		 res+=s1.substring(i, i+1);
		 res+=s2.substring(i, i+1);
		 }
		 }
		 else if(s1.length()<s2.length())
		 {
		 int i;
		 for(i=0;i<s1.length();i++)
		 {
		 res+=s1.substring(i, i+1);
		 res+=s2.substring(i, i+1);
		 }
		 res+=s2.substring(i, s2.length());
		 }
		 else
		 {
		 int i;
		 for(i=0;i<s2.length();i++)
		 {
		 res+=s1.substring(i, i+1);
		 res+=s2.substring(i, i+1);
		 }
		 res+=s1.substring(i, s1.length());
		 }
		 
		 System.out.println(res);

	}

}
