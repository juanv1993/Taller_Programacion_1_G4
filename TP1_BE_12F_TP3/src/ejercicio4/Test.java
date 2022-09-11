package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio3.CasaVendedora;
import ejercicio3.Electrodomestico;
import ejercicio3.Heladera;
import ejercicio3.Lavarropa;
import ejercicio3.Televisor;
import ejercicio3.TipoLavarropa;

public class Test {
	
	
	public static Scanner input;
	public static void main(String[] args) {
	input = new Scanner(System.in);
	
	CasaVendedora fravega = new CasaVendedora();
	fravega.agregarProducto(new Heladera("WH", "SKU", "1213", 220, false, 120000, 220, true));
	fravega.agregarProducto(new Lavarropa("Sony", "Astra", "2344", 120, false, 130000, 6, TipoLavarropa.AUTOMATICO ));
	fravega.agregarProducto(new Televisor("Phillips", "rkt", "303044", 220, false, 30000, 30, true));

	
		
	}

}
