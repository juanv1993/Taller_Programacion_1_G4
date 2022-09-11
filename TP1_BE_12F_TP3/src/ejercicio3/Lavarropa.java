package ejercicio3;

public class Lavarropa extends Electrodomestico {
	
	private int capacidadMaxCarga;
	private TipoLavarropa esAutomatico;
	
	
	public Lavarropa(String marca, String modelo, String serie, int voltaje, boolean estado, double precio,
			int capacidadMaxCarga, TipoLavarropa esAutomatico) {
		super(marca, modelo, serie, voltaje, estado, precio);
		this.capacidadMaxCarga = capacidadMaxCarga;
		this.esAutomatico = esAutomatico;
	}
	
	
	@Override
	public String mostrarDatosCompletos() {
		return super.mostrarDatosCompletos() + "\n Capacidad Maxima de Carga : "+capacidadMaxCarga+ "\n Es automatico :" + esAutomatico.name();
	}
	

}
