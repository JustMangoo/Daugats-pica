package darbins;

public class pasutijums {
	public int Nr;
	public String dzeriens;
	public String uzkodas;
	public double cena;

	public pasutijums(int picNr, String picdzeriens, String picuzkodas, double piccena){
		this.Nr = picNr;
		this.dzeriens = picdzeriens;
		this.uzkodas = picuzkodas;
		this.cena = piccena;
	}
	public double noteiktCenu() {
		return cena;
	}
}