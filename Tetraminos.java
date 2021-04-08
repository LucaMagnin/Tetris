import java.awt.Color;
import java.awt.Graphics;

public class Tetraminos {
	
	
	public Point[] coordsTetrimino;
	public Color couleurTetra;
	public Point origineTetramino;
	public Tetraminos(Point[] coords,Color couleur,Point origine){
		coordsTetrimino=coords;
		couleurTetra=couleur;
		origineTetramino=origine;


	}
	public Tetraminos(Point[] coords,Color couleur){
		coordsTetrimino=coords;
		couleurTetra=couleur;
	}
	/*public int[][] TetraminoAleatoire(){
		int a=(int)(Math.random()*7);
		int[][] TetraminoAleatoire = coordsTetrimino[a];
		return TetraminoAleatoire;
	}*/
	
}
		
		
	

