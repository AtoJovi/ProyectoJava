/**
 * 
 */
package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 */
public class MenuRegister {

	 String  nameUser = "";
	 String cle = "";
	 String completName = "";
	 int age = 0;
	 String nif = "";
	 String mail = "";
	 String address = "";
	 String birth = "";
	
	//al ser una constante TXTONE en mayúscula
	private final String TXTONE = "Ha elegido registrarse. Introduzca primero su nombre: ";
	private final String TXTTWO = "Ahora debe de introducir una contraseña: ";
	private final String TXTTHREE = "Introduzca su nombre completo: ";
	private final String TXTFOUR = "Introduzca su edad: ";
	private final String TXTFIVE = "Introduzca su nif/dni: ";
	private final String TXTSIX = "Introduzca su mail: ";
	private final String TXTSEVEN = "Introduzca su dirección: ";
	private final String TXTEIGHT = "Introduzca su fecha de nacimiento: ";
	
	
	public void printMenuRegister () {
		
			Scanner entradaScanner = new Scanner (System.in); // Creación de un objeto Scanner
			System.out.println(TXTONE);
			nameUser = entradaScanner.nextLine(); 
			System.out.println(TXTTWO);
			cle = entradaScanner.nextLine();
			System.out.println(TXTTHREE);
			completName = entradaScanner.nextLine();
			System.out.println(TXTFOUR);
			//esto es para recoger la excepcion por si se da un caracter en vez de numérico
//			try {
				age = entradaScanner.nextInt();
			
//			}catch(Exception e){
//				age = 0;
//				System.out.println("El formato debe de ser numérico. ");
//				age = entradaScanner.nextInt();
//			}
			
			System.out.println(TXTFIVE);
			nif = entradaScanner.nextLine();
			System.out.println(TXTSIX);
			mail = entradaScanner.nextLine();
			System.out.println(TXTSEVEN);
			address = entradaScanner.nextLine();
			System.out.println(TXTEIGHT);
			birth = entradaScanner.nextLine();
		
	}
	
}
