import javax.swing.JOptionPane;


public class Mapa {
	
	Controls controle = new Controls();
	Nave ship = new Nave();
	Nave enemy = new Nave();
	
	
	public Mapa() {
		
	}
	
	char[][] matriz = new char [10][10];
	String acm = "";
	public void showMap() {
		
			for ( int i=0; i<10; i++) {
				for ( int j=0; j<10; j++) {
					matriz[i][j] = '+';
					acm+= matriz[i][j]+"    ";
					}
				acm += "\n";
			}
			controle.defMoves();
			JOptionPane.showMessageDialog(null, acm);
		
		
	}
	
}
