package paquete1;

public class Medusa extends Mascota{

	private String especie;

	
	public Medusa(String nombre, String especie) {
		super(nombre);
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void mandarMensaje() {
		System.out.println("Soy " + getNombre() + " y te voy a picar ¡¡¡¡¡¡¡PSSSIIIIIII!!!!!!");
	}
	
}
