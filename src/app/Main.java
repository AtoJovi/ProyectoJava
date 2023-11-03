/**
 * 
 */
package app;

import java.util.Scanner;

import menu.MenuRegister;
import menu.MenuStar;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String userPass = "";
		String pass = "";
		String select = "";
		
		MenuStar init = new MenuStar();
		init.printMenu();
		
		Scanner entradaScanner = new Scanner (System.in); // Creación de un objeto Scanner
		select = entradaScanner.nextLine(); //Invocamos un método sobre un objeto Scanner
		System.out.println("La opción elegida es " + select);
		
		
		//para capturar user & pass
		if(("1").equals(select)) {
			System.out.println("Ha elegido inicio de sesión, introduzca su nombre de usuario: ");
			userPass = entradaScanner.nextLine(); 
			System.out.println("Introduzca su password: ");
			pass = entradaScanner.nextLine(); 
		}
		
		if(("2").equals(select)) {
			MenuRegister menuRegister = new MenuRegister();
			menuRegister.printMenuRegister();
		}
		
		//Test Commit
		
	}
	
	//Probando los commit de Git

}
