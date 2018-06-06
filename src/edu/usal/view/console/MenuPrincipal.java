package edu.usal.view.console;

import usal.edu.util.IOGeneral;

public class MenuPrincipal {
	public static int imprimirMenuPrincipalArchivos(){
		return IOGeneral.leerInt("<<<MENU DE ARCHIVOS>>>\nIngrese \n1-Usar objetos\n2-Usar String\n0-salir", "Lo ingresado no fue un numero entero");
		
	}
	
	public static int imprimirMenuPrincipalPrograma(){
		return IOGeneral.leerInt("<<<MENU PRINCIPAL>>>\nIngrese \n1-Menu de Clientes\n2-Menu de \n3-Menu de Carreras\n0-salir", "Lo ingresado no fue un numero entero");
		
	}
	
	public static void opcionIncorrecta() {
		IOGeneral.pritln("Lo ingresado no fue una opcion valida");
	}
}
