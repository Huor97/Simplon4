package loops;

//exo1
public class DevinerLetre {
	public static void main(String[] args) {
		char lettre = 'A';
		
		while(lettre <= 'Z')
		{
			System.out.print(lettre++);
		}
	}
}