package edu.usal.view.console;

import java.util.List;

import edu.usal.negocio.dominio.Alumno;
import usal.edu.dao.factory.ClientesFactory;
import usal.edu.dao.interfaces.ClienteDAO;
import usal.edu.negocio.dominio.Cliente;
import usal.edu.principal.Ejecutar;
import usal.edu.util.IOGeneral;
public class MenuClientes 
{
	public static int ImprimirMenuClientes() 
	{
		return IOGeneral.leerInt("<<<MENU DE ALUMNOS>>>\nIngrese \n1-agregar\n2-mostrar\n3-cambiar\n4-eliminar\n5-gestionar carrera\n0-salir", "Debe ser un numero entero");			
	}
	
	public static void opcionIncorrecta() {
		IOGeneral.pritln("Lo ingresado no fue una opcion valida");
	}
	public static Cliente pedirDatosCliente() {
		Cliente nuevo=new Cliente();
		nuevo.setNombre(IOGeneral.leerLinea("Ingrese nombre"));
		nuevo.setApellido(IOGeneral.leerLinea("Ingrese Apellido"));
		nuevo.setDireccion(IOGeneral.leerLinea("Ingrese Direccion"));
		nuevo.setDni(IOGeneral.leerInt("Ingrese DNI", "Debe ser numero entero"));
		return nuevo;
	}
	public static void mostrarDatosAlumno(Alumno alu){
		IOGeneral.pritln("Datos del Alumno: "+alu.getNombre()+"\n-->Apellido: "+alu.getApellido()+"\n-->Direccion: "+alu.getDireccion()+ "\n-->ID: ["+alu.getDni()+"]\n\n");
	}
	public static int menuSeleccionar(Alumno alu) {
		return IOGeneral.leerInt("El DNI ingresado corresponde al siguiente Alumno\n"+alu.getApellido()+", "+alu.getNombre()+"\nDireccion: "+
				alu.getDireccion()+" \nCarrera: "+alu.getCarrera()+"\n\nConfirma que desea seleccionar a este alumno para la operacion?(1=SI / 0=NO)", "Debe ingresar un numero entero");
	}
	public static void exitoOperacion(){
		IOGeneral.pritln("La operacion se realizo con exito");
	}
	public static void fracasoOperacion(){
		IOGeneral.pritln("La operacion ha fracasado");
	}
	public static void listaVacia(){
		IOGeneral.pritln("La lista está vacia.");
	}
	public static void iDIncorrecto(){
		IOGeneral.pritln("ID no encontrado");
	}
	public static int pedirID() {
		return IOGeneral.leerInt("Ingrese ID", "Debe ingresar un numero entero");
	}
	
	
	
	
	
 }
	

	

