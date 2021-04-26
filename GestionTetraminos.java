import java.util.*;
import java.awt.Color;
import java.awt.Graphics;
public class GestionTetraminos {
	Tetraminos[] tabTetraminos;
	public GestionTetraminos(){


		Tetraminos Z = new Tetraminos(new Point[]{new Point(0, -1), new Point(0, 0), new Point(-1, 0), new Point(-1, 1)},Color.red);
		Tetraminos S = new Tetraminos(new Point[]{new Point(0, -1), new Point(0, 0), new Point(1, 0), new Point(1, 1)},Color.green);
		Tetraminos I = new Tetraminos(new Point[]{new Point(0, -1), new Point(0, 0), new Point(0, 1), new Point(0, 2)},Color.cyan);
		Tetraminos T = new Tetraminos(new Point[]{new Point(-1, 0), new Point(0, 0), new Point(1, 0), new Point(0, 1)},Color.magenta);
		Tetraminos O = new Tetraminos(new Point[]{new Point(0, 0), new Point(1, 0), new Point(0, 1), new Point(1, 1)},Color.yellow);
		Tetraminos L = new Tetraminos(new Point[]{new Point(-1, -1), new Point(0, -1), new Point(0, 0), new Point(0, 1)},Color.orange);
		Tetraminos J = new Tetraminos(new Point[]{new Point(1, -1), new Point(0, -1), new Point(0, 0), new Point(0, 1)},Color.blue);
		
		tabTetraminos = new Tetraminos[] {Z,S,T,O,L,J,I};	
	}
	public Tetraminos TetraminoAleatoire(){
		return tabTetraminos[(int)(Math.random()*7)];
	}
}

		




	
