package loops;

import java.util.Scanner;

public class InferieurDix {
	public static void main(String[] args) {
		try(Scanner Scanner = new Scanner(System.in)){
			int n = 0;
			do
			{
				System.out.println("rentre un nombre SVP : ");
				n = Scanner.nextInt();
				
			}
			while(n < 10);
			Scanner.close();
		}
	}
}

