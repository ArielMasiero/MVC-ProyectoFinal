package edu.usal.controller.console;

import edu.usal.view.console.MenuPrincipal;

public class MenuPrincipalController {
	public static void menuPrincipalPrograma() {
		int res = -1;
		while(res!=0){
			res= MenuPrincipal.imprimirMenuPrincipalPrograma();
			switch(res){
				case 1:MenuClientesController.menuPrincipalClientes();
				break;
				case 0:	System.exit(0);
				default: System.out.println("Numero equivocado");
			}
		}
	}
}
