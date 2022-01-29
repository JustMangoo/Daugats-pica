package darbins;

import javax.swing.JOptionPane;

public class klients {
	public String numurs;
	public String adrese;
	public String vards;

	public klients(String numurs, String adrese, String vards) {
		this.numurs = numurs;
		this.adrese = adrese;
		this.vards = vards;
	}
	public void izvadit(){
		JOptionPane.showMessageDialog(null, "Telefona nr: "+numurs+"\nAdrese: "+adrese+"\nVards: "+vards);
	}
	
}
