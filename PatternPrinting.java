package MainProgram;
import java.util.Scanner;

public class Zoho {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.close();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i>=j) 
					System.out.print(i);
				else
					System.out.print(j);
			}
			System.out.println();
		}
		

}}
