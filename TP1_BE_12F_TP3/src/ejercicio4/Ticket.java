package ejercicio4;

import java.util.ArrayList;

import ejercicio3.Electrodomestico;


public class Ticket implements Imprimible {
	
	private ArrayList<Electrodomestico> ticketCompra;

	public Ticket() {
		
		ticketCompra = new ArrayList<>();
	}

	@Override
	public void imprimir() {
		for (Electrodomestico electrodomestico : ticketCompra) {
			System.out.println(electrodomestico.mostrarDatosCompletos());
		}
	}
	
	
	

}
