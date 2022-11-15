package sandra;

import java.util.Scanner;

public class atajos {

	public static void main(String[] args) {
		// ejercicio 6

		final int  CODIGO_CORRECTO=1234;
		int codigo;
		int intentos;
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduzca clave de 4 digitos");
		codigo=sc.nextInt();
		
		for (intentos=4; intentos>=1; intentos--) {
			
			if (codigo==CODIGO_CORRECTO) {
				System.out.println("Clave introducida correctamente");
			break;
			}
		
			else if (codigo!=CODIGO_CORRECTO) {
				System.out.println("Clave introducida no es correcta");
				System.out.println("Introduzca de nuevo la clave");
				codigo=sc.nextInt();}	
		}
		if (intentos==0) {
			System.out.println("No te quedan mas intentos, cuenta bloqueada");
			}
			
	}
}
			
			
		
		
	
	

