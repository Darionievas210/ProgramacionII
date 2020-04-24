import java.util.Scanner;

public class Enzouser {
	
	public static void main (String[] args) {
		System.out.println("BIENVENIDO");
	
		String usuario = "enzo";
		String contrasena = "1234";
	
		for(int i = 0; i<= 100; i++){
			System.out.println("---------------------------------------------");
			System.out.println("             Login");
			System.out.println("---------------------------------------------");
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese su usuario:");
			String user= teclado.nextLine();
			System.out.println("");
			System.out.println("Ingrese su contrasena:");
			String password= teclado.nextLine();
			
			if (user.equals(usuario) && (password.equals(contrasena))){
				System.out.println("");
				System.out.println("Bienvenido enzo!!!");
				System.out.println("");
			}
			
			else{
				System.out.println("");
				System.out.println("El usuario o la contrasena ingresado son incorrectos");
				System.out.println("");
				System.out.println("Intente nuevamente");
			}
			
		}
		
	}
}
