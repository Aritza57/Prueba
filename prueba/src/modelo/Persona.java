package modelo;

public class Persona {
	
	private String nombre;
	
	private int edad;
	
	private char sexo;
	
	private char origen;

	private float peso;
	
	private int altura;
	
	private Persona pareja;
	
	public Persona() {}

	public Persona(String nombre, int edad, char sexo, char origen,  Persona pareja, float peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.origen = origen;
		this.pareja = pareja;
		this.peso = peso;
		this.altura = altura;		
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public char getOrigen() {
		return origen;
	}

	public void setOrigen(char origen) {
		this.origen = origen;
	}
	
	public Persona getPareja() {
		return pareja;
	}

	public void setPareja(Persona pareja) {
		this.pareja = pareja;
	}
		
	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public boolean esMasJovenQue(Persona p) {
		if(edad < p.getEdad())
			return true;
		else return false;
	}
	
	public boolean esMasJovenQueSuPareja() {
		if(edad < pareja.getEdad())
			return true;
		else return false;
	}
}