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
	 //Esto lo he cambiado a String para que se trague todo lo que le metas
	//Si lo dejamos como int y no meten un numero casca, pero poniendolo como String no da problemas metas un numero o una letra
	// Se podia hacer una clase de validacion para ver que los datos introducidos son coherentes y en el caso de que no mostrar mensaje
	 // y que vuelva a introducirlos pero eso ya lo que te quieras complicar
	 String age = "";
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
				age = entradaScanner.nextLine();
			
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

			//Una vez capturados los valores hay que hacer un objeto tipo User y setearle los valores
			//User user = new ...

		//Luego creamos un objeto tipo Conexion para que nos conecte a bbdd
		//si va bien que muestre un mensaje de que se ha conectado
		// si no uno de error

		//Preparamos la consulta apoyandonos en la clase querys para hacer el inssert en la tabla users
		//si todo va bien mensaje de ok
		//si algo va mal mensaje de KO

		//PD esto son solo ideas si ves alguna manera mejor de hacerlo pues dale!!

	}
	
}
