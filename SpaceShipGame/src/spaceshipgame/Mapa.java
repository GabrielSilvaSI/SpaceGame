package spaceshipgame;


public class Mapa {
	
	public Mapa() {
		
	}
	
	char[][] matriz = new char [10][10];
	String acm = "";
        
        public String attShips(int xPlayer, int yPlayer, int xEnemy, int yEnemy){
            acm = "";
            for ( int i=0; i<10; i++) {
		for ( int j=0; j<10; j++) {
                    if((xEnemy==j)&&(yEnemy==i)){
                        matriz[i][j] = '*';
                    }else{
                        if((xPlayer==j)&&(yPlayer==i)){
                            matriz[i][j] = '^';
                        }else{
                            matriz[i][j] = '0';
                        }
                    }
                    acm+= matriz[i][j]+"   ";
		}
                acm += "\n";
            }
            return acm;
        }
	
}
