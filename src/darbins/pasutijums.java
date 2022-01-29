package darbins;

import javax.swing.JOptionPane;

public class pasutijums {
	public String dzeriens;
	public String uzkodas;
	public double cena;

	public pasutijums(String picdzeriens, String picuzkodas, double piccena){
		this.dzeriens = picdzeriens;
		this.uzkodas = picuzkodas;
		this.cena = piccena;
	}
	public double noteiktCenu() {
		
		if(!dzeriens.equals("nav")) {
			cena+=1.25;
		}
		if(!uzkodas.equals("nav")) {
			cena+=1.25;
		}
		return cena;
	}
	public void izvadit(){
		JOptionPane.showMessageDialog(null, "Dzeriens: "+dzeriens+"\nUzkodas:"+uzkodas+"\n\nCena: "+cena);
	}
}