package loops;

import java.util.Scanner;
//exo5

public class Carre {
	public static void main(String[] args) {
		try(Scanner Scanner = new Scanner(System.in))
		{
			System.out.println("rentre des nombre SVP :");
			
			int n = Scanner.nextInt();
			
			int i = 0;
			int j = 0;
			for ( i=1; i<n ;i++)
			{
				for ( j=1; j<n ;j++)
			{
					System.out.print("x");
			}
			
			System.out.println("x");
			}
		
		}
	}
}
