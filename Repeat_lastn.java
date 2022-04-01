import java.util.Scanner;

public class Repeat_lastn {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the string : ");
		 String s=sc.next();//sc.close();
		 System.out.println("Enter the number : ");
		 int n = sc.nextInt();
		 if(n>s.length())
			 System.err.println("exceded length");
		 else{
		 int cnt=1,index=0;
		 for(int i=s.length()-1;i>=0;i--)
		 {
		 if(cnt==n) index=i;cnt++;
		 }
		 String c=s.substring(index, s.length());
		 for(int i=0;i<n;i++) System.out.print(c);
		 }

		

	}

}
