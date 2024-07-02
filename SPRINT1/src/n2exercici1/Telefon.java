package n2exercici1;

public class Telefon {
	//atributs marca i model, i el mètode trucar(). Aquest mètode ha de rebre un String amb un número de telèfon. 
	//El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut per paràmetre. 
	
	private String marca;
	private String model;
	
	public Telefon(String marca, String model) {
		this.marca = marca;
		this.model = model;
	}
	
	public String getMarca () {
		return this.marca;
	}
	public String getModel() {
		return this.model;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String trucar(String numTelf) { 
		return "S'está trucant al número " + numTelf; //Recibe el número como parametro.??
	}
	
}
