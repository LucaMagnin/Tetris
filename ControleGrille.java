import java.util.*;
//Controle grille
public class ControleGrille  {
	private final int NBCASESLARGEUR;
	private final int NBCASESLONGUEUR;
	int[][] grille;
	Tetraminos tetraminoActuel;
	
	public ControleGrille(int largeur, int longueur){
		NBCASESLARGEUR=largeur+2;
		NBCASESLONGUEUR=longueur+1;
		
		
	}
	
	public void initialiserGrille(){
		grille=new int[NBCASESLONGUEUR][NBCASESLARGEUR];
		for(int i=0;i<grille.length-1;i++){
			for(int j=0;j<grille[i].length;j++){
				if(j==0||j==grille[i].length-1){
					grille[i][j]=10;
				}
			}
		}
		for(int k=0;k<NBCASESLARGEUR;k++){
			grille[NBCASESLONGUEUR-1][k]=10;
		}
		 //nouvellePiece();
	}
	

		
	public void initialiserTetramino(Tetraminos tetra){
		for (int i = 0; i<tetra.coordsTetrimino.length; i++){
			grille[1+tetra.coordsTetrimino[i].y][4+tetra.coordsTetrimino[i].x]=1;
		}
	}
	

	public String ToString(){
		String s=new String();
		for(int i=0;i<grille.length;i++){
			for(int j=0; j<grille[i].length;j++){
				s=s+grille[i][j]+" ";
			}
			s=s+"\n";
		}
		return s;
	}

  
	public boolean ObjetDessous(){
		int i=0;
		boolean t = false;
		while(!t && i<tetraminoActuel.coordsTetrimino.length){
			if (grille[tetraminoActuel.coordsTetrimino[i].y+1][tetraminoActuel.coordsTetrimino[i].x]==1){
				for(int j=0;j<tetraminoActuel.coordsTetrimino.length;j++){
					if(tetraminoActuel.coordsTetrimino[i].y+1!=tetraminoActuel.coordsTetrimino[j].y&&tetraminoActuel.coordsTetrimino[i].x!=tetraminoActuel.coordsTetrimino[j].x){//teste si le carré du tetramino qui interfère n'est pas à lui même
						t = true;
					}
				}
				
			}			
			i++;
		}
        return t;
	}
	
	public boolean ObjetDroite(){
		int i=0;
		boolean t = false;
		while(!t && i<tetraminoActuel.coordsTetrimino.length){
			if (grille[tetraminoActuel.coordsTetrimino[i].y][tetraminoActuel.coordsTetrimino[i].x+1]==1){
				for(int j=0;j<tetraminoActuel.coordsTetrimino.length;j++){
					if(tetraminoActuel.coordsTetrimino[i].y!=tetraminoActuel.coordsTetrimino[j].y&&tetraminoActuel.coordsTetrimino[i].x+1!=tetraminoActuel.coordsTetrimino[j].x){//teste si le carré du tetramino qui interfère n'est pas à lui même
						t = true;
					}
				}
				
			}			
			i++;
		}
        return t;
	}
	public boolean ObjetGauche(){
		int i=0;
		boolean t = false;
		while(!t && i<tetraminoActuel.coordsTetrimino.length){
			if (grille[tetraminoActuel.coordsTetrimino[i].y][tetraminoActuel.coordsTetrimino[i].x-1]==1){
				for(int j=0;j<tetraminoActuel.coordsTetrimino.length;j++){
					if(tetraminoActuel.coordsTetrimino[i].y==tetraminoActuel.coordsTetrimino[j].y&&tetraminoActuel.coordsTetrimino[i].x-1==tetraminoActuel.coordsTetrimino[j].x){//teste si le carré du tetramino qui interfère n'est pas à lui même
						t = true;
					}
				}
				
			}			
			i++;
		}
        return t;
	}
	
	public void Descendre() {
		if(!ObjetDessous()){ 
			for (int i=0;i<tetraminoActuel.coordsTetrimino.length;i++){
				tetraminoActuel.coordsTetrimino[i].y++;   
			}
		}
	}   
	
	




	 

	 
	 
}
