package ejercicio4;

public class Cliente implements Imprimible {
	
	private int cuil;
	private String apenom;
	
	
	public Cliente(int cuil, String apenom) {
		super();
		this.cuil = cuil;
		this.apenom = apenom;
	}


	@Override
	public void imprimir() {
		System.out.println("CUIL : "+cuil+"\nNombre y apellido :"+apenom);
	}
	
	
	

}
