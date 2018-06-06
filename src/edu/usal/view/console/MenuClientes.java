package edu.usal.view.console;
import java.util.List;

import usal.edu.dao.factory.ClientesFactory;
import usal.edu.dao.interfaces.ClienteDAO;
import usal.edu.negocio.dominio.Cliente;
import usal.edu.negocio.dominio.Direccion;
import usal.edu.negocio.dominio.PasajeroFrecuente;
import usal.edu.negocio.dominio.Pasaporte;
import usal.edu.negocio.dominio.Telefono;
import usal.edu.util.IOGeneral;
public class MenuClientes 
{
	public static int ImprimirMenuClientes() 
	{
		return IOGeneral.leerInt("<<<MENU DE Clientes>>>\nIngrese \n1-agregar\n2-mostrar\n3-cambiar\n4-eliminar\n5-gestionar Vuelo\n0-salir", "Debe ser un numero entero");			
	}
	
	public static void opcionIncorrecta() {
		IOGeneral.pritln("Lo ingresado no fue una opcion valida");
	}
	
	
	public static Cliente pedirDatosCliente() {
		Cliente nuevo=new Cliente();
		nuevo.setNombre(IOGeneral.leerLinea("Ingrese nombre"));
		nuevo.setApellido(IOGeneral.leerLinea("Ingrese Apellido"));
		nuevo.setCuit(IOGeneral.leerLinea("Ingrese cuit"));
		nuevo.setEmail(IOGeneral.leerFrase("Ingrese Email"));
		nuevo.setFechaDeNacimiento(IOGeneral.leerFrase("Ingrese fecha de nacimiento (dia/mes/año)"));
		nuevo.setPasaporte(ingresarpasaporte());
		nuevo.setDireccion(ingresarDireccion());
		nuevo.setTelefono(ingresarTelefono());
		nuevo.setPasajeroFrecuente(ingresarPasajeroFrecuente());
		return nuevo;
	}
	private static PasajeroFrecuente ingresarPasajeroFrecuente() {
		PasajeroFrecuente pasajero=new PasajeroFrecuente();
		pasajero.setAereolinea();
		pasajero.setAlianza(IOGeneral.leerFrase("Ingresar alianza"));
		pasajero.setCategoria(IOGeneral.leerFrase("ingresar categoria"));
		pasajero.setNumero(IOGeneral.leerFrase("ingresar numero"));
		return pasajero;
	}

	private static Telefono ingresarTelefono() {
		Telefono telefono = new Telefono();
		telefono.setNumeroPersonal(IOGeneral.leerFrase("Ingrese numero de telefono personal"));
		telefono.setLaboral(IOGeneral.leerFrase("Ingrese numero de telefono laboral"));
		telefono.setCelular(IOGeneral.leerFrase("Ingrese numero de linea movil"));
		return telefono;
	}

	public static Direccion ingresarDireccion()
	{
		Direccion direccion=new Direccion();
		direccion.setPais(IOGeneral.leerFrase("Ingresar pais de residencia"));
		direccion.setProvincia(IOGeneral.leerFrase("Ingresar provincia de residencia"));
		direccion.setCiudad(IOGeneral.leerFrase("ingresar ciudad"));
		direccion.setCodigopostal(IOGeneral.leerFrase("Ingrese codigo postal"));
		direccion.setCalle(IOGeneral.leerFrase("Ingresar calle de residencia"));
		direccion.setAltura(IOGeneral.leerFrase("ingrese la altura de residencia"));
		return direccion;
	}
	public static Pasaporte ingresarpasaporte() {
		Pasaporte pasaporte = new Pasaporte();
		pasaporte.setNumeroDePasaporte(IOGeneral.leerLinea("Ingrese numero de pasaporte"));
		pasaporte.setAutoridadDeEmision(IOGeneral.leerLinea("ingrese Autoridad de emision"));
		pasaporte.setFechaEmision(IOGeneral.leerLinea("Ingrese fecha de emision (dia/mes/año)"));
		pasaporte.setPaisEmision(IOGeneral.leerLinea("Ingresar fecha de emision (dia/mes/año)"));
		pasaporte.setFechaVencimiento(IOGeneral.leerLinea("ingresar fecha de vencimiento (dia/mes/año)"));
		return pasaporte;
	}
	
	
 }
	

	

