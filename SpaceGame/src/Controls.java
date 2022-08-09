import javax.swing.JOptionPane;

public class Controls {
	
	Nave shipCoord = new Nave();
	int x, y;
	
	public Controls() {
		
	}
	

	public void defMoves() {
		
		JOptionPane.showInputDialog("Insira as coordenadas horizontais da nave", x);
		JOptionPane.showInputDialog("Insira as coordenadas verticais da nave", y);
		
	}
	
	
	
}
