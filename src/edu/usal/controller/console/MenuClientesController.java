package edu.usal.controller.console;

import java.util.List;

import edu.usal.view.console.MenuClientes;
import usal.edu.dao.factory.ClientesFactory;
import usal.edu.dao.interfaces.ClienteDAO;
import usal.edu.negocio.dominio.Cliente;
import usal.edu.principal.Ejecutar;


public class MenuClientesController {
	private static ClienteDAO cliente;
	
	private static List<Cliente> Clientes;
	private static Cliente nuevo;
	
	public static void menuPrincipalClientes() {
		cliente=ClientesFactory.getClientesDAO(Ejecutar.leerArchivo);
		int res = -1;
		while(res!=0){
			res= MenuClientes.ImprimirMenuClientes();
			switch(res){
				case 1:agregar();
				break;
				case 2:mostrar();
				break;
				case 3:modificar();
				break;
				case 4:eliminar();
				break;
				case 0:	return;
				default: MenuClientes.opcionIncorrecta();
			}
		}
	}

	private static void eliminar() {
		// TODO Auto-generated method stub
		
	}

	private static void modificar() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrar() {
		// TODO Auto-generated method stub
		
	}

	private static void agregar() {
		// TODO Auto-generated method stub
		
	}

}
