import java.util.Scanner;

public class Cuentavocal {
	public static void main(String[] args) {
		System.out.println("BIENVENIDO");
		System.out.println("");
		System.out.println("El siguiente programa muestra la cantidad de vocales en una frase");
		System.out.println("");
        Scanner teclado = new  Scanner ( System.in);
        System.out.println ( " Ingrese una cadena de texto a verificar: " );
        String cadena = teclado.nextLine();
		int contador=0;

        for (int i = 0 ; i < cadena.length(); i++) {
        	if( (cadena.charAt(i)=='a')||
				(cadena.charAt(i)=='e')||
				(cadena.charAt(i)=='i')||
				(cadena.charAt(i)=='o')||
        		(cadena.charAt(i)=='u')) {
        		
        		contador++;        		
        	}
        }
        System.out.print("Esta frase tiene " + contador + " vocales");
        System.out.print("");
	}
}
