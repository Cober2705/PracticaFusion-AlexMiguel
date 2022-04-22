package paquete1;

public class Leon extends Mascota{
	
	private String sexo;

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public Leon(String nombre, String sexo) {
		super(nombre);
		this.sexo = sexo;
	}
	
	public void mandarMensaje() {
		System.out.println("Soy el Leon " + getNombre() + " de sexo "+ this.sexo +" y hago ROOOAAAARRRRR");
	}

}
