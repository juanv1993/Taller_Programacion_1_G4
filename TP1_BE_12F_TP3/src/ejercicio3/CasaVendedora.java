package ejercicio3;

import java.util.ArrayList;

public class CasaVendedora {

	private ArrayList<Electrodomestico> articulosALaVenta;
	
	public CasaVendedora() {
		this.articulosALaVenta = new ArrayList<>();
	}
	
	
	
	// METODO QUE SIRVE PARA MOSTRAR LA LISTA DE ARTICULOS QUE HAY EXHIBIDOS EN LA CASA COMERCIAL
	public void mostrarListaArticulos() {
		System.out.println("A continuación los artículos a la venta : \nRecuerde elegir por medio de los diferentes números que aparecen");
		int cont = 0;
		for (Electrodomestico electrodomestico : articulosALaVenta) {		
			cont++;
			System.out.println(cont +" - " + electrodomestico.datosProducto());
		}
		
	}
	
	// METODO QUE DEVUELVE LA CANTIDAD DE ARTICULOS QUE HAY A LA VENTA
	public int cantidadArticulos() {
		return articulosALaVenta.size();
	}
	
	

	public Electrodomestico traerArticulo( int i ) {
		return articulosALaVenta.get(i-1);
	}
	
	//METODO PARA AGREGAR LOS ARTICULOS QUE ESTAN A LA VENTA EN EL COMERCIO 
	public void agregarProducto(Electrodomestico e ) {
		articulosALaVenta.add(e);
	}
	
}
