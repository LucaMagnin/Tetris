import java.util.*;import java.awt.Color;//Controle grillepublic class ControleGrille  {	private final int NBCASESLARGEUR=12;	private final int NBCASESLONGUEUR=21;	public Color[][] grille;	public Tetraminos tetraminoActuel;	public Tetraminos tetraminoPrecedentePosition;	public Tetraminos tetraminoHold;	public Tetraminos tetraminoSuivant;	GestionTetraminos gestionTetraminos=new GestionTetraminos();	public int score;	public boolean perdu=false;	public ControleGrille(){	}		public void initialiserGrille(){		grille=new Color[NBCASESLONGUEUR][NBCASESLARGEUR];		for(int i=0;i<grille.length;i++){			for(int j=0;j<grille[i].length;j++){				if(j==0||j==grille[i].length-1){					grille[i][j]=Color.gray;				}else{					grille[i][j]=Color.black;				}			}		}		for(int k=0;k<NBCASESLARGEUR;k++){			grille[NBCASESLONGUEUR-1][k]=Color.gray;		}		tetraminoSuivant=gestionTetraminos.TetraminoAleatoire();		initialiserTetramino();		//initialiserTimer();	}		/*public void initialiserTimer(){		Timer chrono = new Timer();		chrono.schedule(new TimerTask(){			public void run(){				Descendre();			}		},1000,1000);	}*/			public void initialiserTetramino(){		Point[] coordonneesTetraActuel=tetraminoSuivant.coordsTetrimino;		Color couleurTetraActuel=tetraminoSuivant.couleurTetra;		tetraminoActuel=new Tetraminos(coordonneesTetraActuel,couleurTetraActuel ,new Point(5,1));		tetraminoSuivant=gestionTetraminos.TetraminoAleatoire();		if(ObjetDessous()==true){				new gameOver();				perdu=true;						}		//MettreAJourGrille();	}		 	public boolean ObjetDessous(){		int i=0;		boolean t = false;		while(!t && i<tetraminoActuel.coordsTetrimino.length){			if (grille[tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[i].y+1][tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[i].x]!=Color.black){						t = true;							}						i++;		}        return t;	}		public boolean ObjetDroite(){		int i=0;		boolean t = false;		while(!t && i<tetraminoActuel.coordsTetrimino.length){			if (grille[tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[i].y][tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[i].x+1]!=Color.black){				for(int j=0;j<tetraminoActuel.coordsTetrimino.length;j++){					if(tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[i].y!=tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[j].y&&tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[i].x+1!=tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[j].x){//teste si le carré du tetramino qui interfère n'est pas à lui même						t = true;					}				}							}						i++;		}        return t;	}		public boolean ObjetGauche(){		int i=0;		boolean t = false;		while(!t && i<tetraminoActuel.coordsTetrimino.length){			if (grille[tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[i].y][tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[i].x-1]!=Color.black){				for(int j=0;j<tetraminoActuel.coordsTetrimino.length;j++){					if(tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[i].y!=tetraminoActuel.origineTetramino.y+tetraminoActuel.coordsTetrimino[j].y&&tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[i].x-1!=tetraminoActuel.origineTetramino.x+tetraminoActuel.coordsTetrimino[j].x){//teste si le carré du tetramino qui interfère n'est pas à lui même						t = true;					}				}							}						i++;		}        return t;	}		public void Descendre() {		if(!ObjetDessous()){			tetraminoActuel.origineTetramino=new Point(tetraminoActuel.origineTetramino.x,tetraminoActuel.origineTetramino.y+1);		}else{			FixerPiece();		}	}  		public void FixerPiece() {		for(int i=0;i<4;i++){			grille[tetraminoActuel.coordsTetrimino[i].y+tetraminoActuel.origineTetramino.y][tetraminoActuel.coordsTetrimino[i].x+tetraminoActuel.origineTetramino.x]=tetraminoActuel.couleurTetra;		}		initialiserTetramino();	}		public void DeplacementADroite() {		if(!ObjetDroite()){			tetraminoActuel.origineTetramino=new Point(tetraminoActuel.origineTetramino.x+1,tetraminoActuel.origineTetramino.y);		}	}    	public void DeplacementAGauche() {		if(!ObjetGauche()){			tetraminoActuel.origineTetramino=new Point(tetraminoActuel.origineTetramino.x-1,tetraminoActuel.origineTetramino.y);		}	}  		public void RotationGauche(){		if(tetraminoActuel.couleurTetra != Color.yellow){			for (int i = 0; i < 4; ++i) {				tetraminoActuel.coordsTetrimino[i].x=tetraminoActuel.coordsTetrimino[i].y;				tetraminoActuel.coordsTetrimino[i].y=-tetraminoActuel.coordsTetrimino[i].x;			}		}	}		public void RotationDroite(){		if(tetraminoActuel.couleurTetra != Color.yellow){			for (int i = 0; i < 4; ++i) {				tetraminoActuel.coordsTetrimino[i].x=-tetraminoActuel.coordsTetrimino[i].y;				tetraminoActuel.coordsTetrimino[i].y=tetraminoActuel.coordsTetrimino[i].x;								}		}	}	public int[] LigneComplete(){		LinkedList <Integer> lignesASupprimer=new LinkedList<Integer>();;		for(int i=0;i<grille.length;i++){			int j=0;			while(j<grille[i].length||grille[i][j]!=Color.black){				j++;			}			if (j==grille[i].length){				lignesASupprimer.add(j);			}		}		int[] lignesASup = new int[lignesASupprimer.size()];		for(int k=0;k<lignesASup.length;k++){			lignesASup[k]=lignesASupprimer.get(k);		}		return lignesASup;	}		public void SupprimerLigne(){		int[] lignesASupp=LigneComplete();		for(int k=0;k<lignesASupp.length;k++){			for(int i=lignesASupp[k];i<0;i--){				for(int j=1;j<grille[lignesASupp[k]].length-1;j++){					grille[i][j]=grille[i-1][j];				}			}		}	}			public int Score(){		int[] lignesASupp=LigneComplete();		if(lignesASupp.length==1){			score=score+40;		}		if(lignesASupp.length==2){			score=score+100;		}			if(lignesASupp.length==3){			score=score+300;		}		if(lignesASupp.length==4){			score=score+1200;		}		return score;	}	}