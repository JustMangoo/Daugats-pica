package darbins;

import javax.swing.JOptionPane;

public class pica {
	public int izmers;
	public boolean merce;
	public boolean desa;
	public boolean tomati;
	public boolean olives;
	public boolean vista;
	public boolean bekons;
	public boolean ananas;
	public boolean senes;
	
	public pica(int izmers, boolean merce, boolean desa, boolean tomati, boolean olives, boolean vista, boolean bekons, boolean ananas, boolean senes) {
		this.izmers = izmers;
		this.merce = merce;
		this.desa = desa;
		this.tomati = tomati;
		this.olives = olives;
		this.vista = vista;
		this.bekons = bekons;
		this.ananas = ananas;
		this.senes = senes;
	}
	
	public double noteiktCenu() {
		double cena=0;
		if(izmers == 20) {
			cena+=2;
		}else if(izmers == 30) {
			cena+=2.50;
		}else {
			cena+=3.50;
		}
		
		if(merce==true) {
			cena+=0.10;
		}
		if(desa==true) {
			cena+=0.50;
		}
		if(tomati==true) {
			cena+=0.40;
		}
		if(olives==true) {
			cena+=0.60;
		}
		if(vista==true) {
			cena+=0.60;
		}
		if(bekons==true) {
			cena+=0.70;
		}
		if(ananas==true) {
			cena+=0.75;
		}
		if(senes==true) {
			cena+=0.50;
		}
		return cena;
	}
	
	public void izvadit(){
		JOptionPane.showMessageDialog(null, "Lielums: "+izmers+"\nmerce:"+merce+"\nDesa:"+desa+"\nTomati:"
	+tomati+"\nolives:"+olives+"\nvista:"+vista+"\nbekons:"+bekons+"\nananas:"+ananas+"\nsenes:"+senes);
	}
}
