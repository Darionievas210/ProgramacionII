import java.util.Scanner;

public class Enzouser2 {

	public static void main (String[] args) {
		System.out.println("BIENVENIDO");
		String usuario = "enzo";
		String contrasena = "1234";
	
		for(int i = 0; i<= 100; i++){
			System.out.println("----------------------------------------");
			System.out.println("             Login");
			Scanner teclado = new Scanner(System.in);
			System.out.println("----------------------------------------");
			System.out.println("Ingrese su usuario:");
			String user= teclado.nextLine();
			System.out.println("");
			System.out.println("Ingrese su contrasena:");
			String password= teclado.nextLine();
			
			if (user.equals(usuario) && (password.equals(contrasena))){
				System.out.println("");
				System.out.println("Bienvenido enzo!");
				System.out.println("");
				System.out.println("Deseas cambiar la contrasena?");
				System.out.println("1-Si");
				System.out.println("2-No");
				String opcion = teclado.nextLine();
				
				if (opcion.equals("1")){
					System.out.println("");
					System.out.println("Ingrese su nueva contraseña");
					String nuevacontrasena =teclado.nextLine();
					System.out.println("");
					System.out.println("Su contrasena se ah cambiado con exito!");
					System.out.println("");
					System.out.println("Su nueva contraseña es:" + nuevacontrasena);
					System.out.println("");
					contrasena=nuevacontrasena;//se permuta inicial el valor de contrasena
					}
			
				else if (opcion.equals("2")){
					System.out.println("");
					System.out.println("Ok!");
					System.out.println("Adios Enzo!");
					System.out.println("");
					System.out.println("Fin del programa");
					break;}	//break detiene el bucle
				else {
					System.out.println("");
					System.out.println("ERROR! ");
					System.out.println("Ste men (has presionado tecla numero menos el 1 y el 2)");
					}	
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
