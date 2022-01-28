package darbins;

import javax.swing.JOptionPane;

public class Picerija {
	public static pica[] pasutit(pica[] picuMas) {
		for(int i=0; i<picuMas.length; i++){
		int picIzmers;
		boolean picMerce;
		boolean picDesa;
		boolean picTomati;
		boolean picOlives;
		boolean picVista;
		boolean picBekons;
		boolean picAnanas;
		boolean picSenes;
		
		do {
			picIzmers = Integer.parseInt(JOptionPane.showInputDialog("Picas izmers\n20 | 30 | 50"));
			}while(picIzmers != 20 && picIzmers != 30 && picIzmers != 50);
		do {
			picMerce = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot pamatnei merci?\ntrue | false"));
			}while(picMerce != true && picMerce != false);
		do {
			picDesa = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot desu?\ntrue | false"));
			}while(picDesa != true && picDesa != false);
		do {
			picTomati = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot tomatus?\ntrue | false"));
			}while(picTomati != true && picTomati != false);
		do {
			picOlives = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot olives?\ntrue | false"));
			}while(picOlives != true && picOlives != false);
		do {
			picVista = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot vistu?\ntrue | false"));
			}while(picVista != true && picVista != false);
		do {
			picBekons = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot bekonu?\ntrue | false"));
			}while(picBekons != true && picBekons != false);
		do {
			picAnanas = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot ananasus?\ntrue | false"));
			}while(picAnanas != true && picAnanas != false);
		do {
			picSenes = Boolean.parseBoolean(JOptionPane.showInputDialog("Vai pievienot senes?\ntrue | false"));
			}while(picSenes != true && picSenes != false);
		
		picuMas[i] = new pica(picIzmers, picMerce, picDesa, picTomati, picOlives, picVista, picBekons, picAnanas, picSenes);
		}
		return picuMas;
	}
	
	public static klients iezveidotKlientu(klients Klients) {
		String klNumurs = JOptionPane.showInputDialog("Jusu nummurs");
		String klAdrese = JOptionPane.showInputDialog("Jusu adrese");
		String klVards  = JOptionPane.showInputDialog("Jusu vards");
		
		return Klients;
	}

	public static void main(String[] args) {
		try {
		String izvele;
		pica[] picuMas = null;
		pasutijums[] pasutMas = null;
		klients Klients = null;
		do {
			izvele = JOptionPane.showInputDialog("1-veikt pasutijumu |2-skatit pasutijumu |3-skatit picas |4-skatit klienta info|stop-apturet");
			izvele = izvele.toLowerCase();
			
			switch(izvele){
				case "1":
					Klients = iezveidotKlientu(Klients);
					
					int picuSkaits = Integer.parseInt(JOptionPane.showInputDialog("Cik picas cept?"));
					picuMas = new pica[picuSkaits];
					picuMas = pasutit(picuMas);
					break;
				
				case "2":
					break;
					
				case "3":
					break;
					
				case "4":
					break;
				case "stop":
					JOptionPane.showMessageDialog(null, "Programma aptureta!", "Bridinajums!", JOptionPane.WARNING_MESSAGE );
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Darbiba nepastav!", "Kluda!", JOptionPane.ERROR_MESSAGE );
					
			}
		}while(!izvele.equals("stop"));
		

	}catch(Exception e){
		JOptionPane.showMessageDialog(null, "Darbiba nepastav!", "Klume", JOptionPane.ERROR_MESSAGE );
		}
	}
}
