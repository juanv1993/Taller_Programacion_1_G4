package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
		public static Scanner input;
		
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int articuloSeleccionado;
		
		ArrayList<Electrodomestico> l = new ArrayList<>();
		
		Electrodomestico heladera1 = new Heladera("TopMount", "rkrkkk", "31232132", 102, false, 234242, 323, false);
		CasaVendedora nueva = new CasaVendedora();
		
		nueva.agregarProducto(heladera1);
		 
		do {
		nueva.mostrarListaArticulos();
		articuloSeleccionado = elijaUnaOpcion(nueva.cantidadArticulos());
		if ( articuloSeleccionado !=0 ) {
		agregarCarrito( l , nueva.traerArticulo(articuloSeleccionado));
		}
		
		} while ( articuloSeleccionado !=0);
		
		mostrarTicketFinal(l);
		
		
	}
	
	public static void mostrarTicketFinal( ArrayList< Electrodomestico > ticket ) {
		System.out.println("Ticket de compra ");
		double costoF = 0;
		for (Electrodomestico electrodomestico : ticket) {
			costoF = costoF + electrodomestico.getPrecio();
			System.out.println(electrodomestico.mostrarDatosCompletos());
		}
		
		System.out.println("Costo total de la compra : " +costoF);
	}
	
	
	// validacion de numero ingresado por el usuario al sistema para adquirir producto 
	// el  -1 es dado que la posición 1 del arrayList esta dada por el 0
	public static int elijaUnaOpcion( int cantidad) {
		System.out.println("Elija una de las opciones de la lista, recuerde que para finalizar debe poner 0");
		int opcion;
		do {
			opcion = Integer.parseInt(input.nextLine());
			if ((opcion-1 <0 || opcion-1 >cantidad) && opcion!=0)
			// la opcion no debe ser menor a 0 que es la posicion 1 de todo array y tampoco mayor a su size, por otro lado el 0 representa cuando no queremos seguri comprando
			{
				System.out.println("Opcion invalida, recuerde que puede elegir hasta la opcion "+cantidad+"\nPara finalizar compra colocar 0");
			}
		} while ((opcion-1 <0 || opcion-1 >cantidad) && opcion!=0);
		
		
		return opcion;
	}
	
	
	// metodo que permite agregar elementos a la lista de compras del usuario creada anteriormente en el mail
	public static void agregarCarrito(ArrayList<Electrodomestico> seleccion , Electrodomestico e) {
		seleccion.add(e);
	}
	

}
