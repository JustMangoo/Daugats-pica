package darbins;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		String izvele;
		
		do {
			izvele = JOptionPane.showInputDialog("1-izveidot pasutijumu |2-skatit klientus |3-skatit picas |stop-apturet");
			izvele = izvele.toLowerCase();
			
			switch(izvele){
				case "1":
					
					break;
				
				case "2":
					break;
					
				case "3":
					break;
					
				case "stop":
					JOptionPane.showMessageDialog(null, "Programma aptureta!", "Bridinajums!", JOptionPane.WARNING_MESSAGE );
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Darbiba nepastav!", "Kluda!", JOptionPane.ERROR_MESSAGE );
					
			}
		}while(!izvele.equals("stop"));
		

	}

}
