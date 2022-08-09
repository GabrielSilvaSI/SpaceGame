import javax.swing.JOptionPane;

public class Controls {
	
	Nave shipCoord = new Nave();
	
	public Controls() {
		
	}
	

	public void defMoves() {
		
		Integer.parseInt(JOptionPane.showInputDialog("Insira as coordenadas horizontais da nave", shipCoord.getX()));
		Integer.parseInt(JOptionPane.showInputDialog("Insira as coordenadas verticais da nave", shipCoord.getY()));
		
	}
	
	
	
}
