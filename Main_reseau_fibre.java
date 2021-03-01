
/* Version de l'algorithme de Prim-Jarnik utilisant
une ArrayList pour les aretes et aussi pour les sommets rejoints

Graphe: aretes spécifiees par matrice de distances
*/

import java.util.*;

public class Main_reseau_fibre {    
    public static void main(String[] args){
        
        int nbSommets = 7;
        
        // matrice des distances entre sommets
        int [][] matDist = {
            { 0, 30, 40, 50, 20, 50, 20},
            {30,  0, 30,  0, 50,  0,  0},
            {40, 30,  0, 20, 50,  0,  0},
            {50,  0, 20,  0, 40,  0,  0},
            {20, 50, 50, 40,  0, 40, 30},
            {50,  0,  0,  0, 40,  0,  0},
            {20,  0,  0,  0, 30,  0,  0}};
        
        
        // representation de l'ensemble S de l'algorithme
        // par la liste suivante:
        ArrayList<Arete> lesAretes = new ArrayList<Arete>();
        
        // construction de l'ensemble des aretes a partir de
        // la matrice de distances
        for(int i=0;i<nbSommets-1;i++){
            for(int j=i+1;j<nbSommets;j++){
                if (matDist[i][j] != 0){
                    Arete uneArete = new Arete(i,j,matDist[i][j]);
                    lesAretes.add(uneArete);
                    
                    System.out.println(uneArete); // Pour voir les aretes dans la console
                    
                }
            }
        }
         System.out.println("______________________________________________________");

        // representation de l'ensemble R de l'algorithme
        // par la liste suivante:
        ArrayList<Integer> lesSommetsRejoints = new ArrayList<Integer>();
        
        // representation de l'ensemble C de l'algorithme
        // par la liste suivante:
        ArrayList<Arete> newAretes = new ArrayList<Arete>();
        
        // ATTENTION c'est bien Integer et non int
        
        // initialisation
        lesSommetsRejoints.add(0);
        
        // COMPLETER LE CODE ICI
        while (lesSommetsRejoints.size()<matDist.length){
			int min=2147483647;
			Arete argmin=new Arete();
			for(Arete s : lesAretes){
				boolean ca=lesSommetsRejoints.contains(s.sommetA);
				boolean cb=lesSommetsRejoints.contains(s.sommetB);
				if((ca&&!cb)||(!ca&&cb)){
					if(min>s.poids){
						min=s.poids;
						argmin=s;
					}
				}
				
				
			}
			if(lesSommetsRejoints.contains(argmin.sommetA)){
				lesSommetsRejoints.add(argmin.sommetB);
			}else{
				lesSommetsRejoints.add(argmin.sommetA);
			}
			newAretes.add(argmin);	
				

		}
		for(Integer r : lesSommetsRejoints){
			System.out.println(r);
		}
		for(Arete e : newAretes){
			System.out.println(e);
		}
    }
}
