/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igl_tp;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 *
 * @author Boudjedar Sabrina
 */
public class VectorHelper {
    private int taille;

    /**
     *
     */
    protected int [] tab=new int [100];
    private int max = 0;
    private int min = 0; 
    /**
     * @author Boudjedar Sabrina
     * le constrecteur de la classe Vector Helper qui permet d'initialiser les attributs de cette classe
     * @param taille 
     * @param tab
     */
    public VectorHelper(int taille,int []tab) {
        this.taille = taille;
        this.tab=tab;
    }
    /**
     * @author Bouhenniche Sihem
     *récuperer la taille du tableau
     * @return int la taille du tableau
     */
    public int getTaille() {
        return taille;
    }

    /**
     * @author Bouhenniche Sihem
     *récuperer le tableau d'elements
     * @return tableau d'elements
     */
    public int[] getTabElements() {
        return tab;
    }

    /**
     * @author Bouhenniche Sihem
     * recuperer le max 
     * @return int maximum
     */
    public int getMax() {
        return max;
    }

    /**
     * @author Bouhenniche Sihem
     *recuperer le min
     * @return int minimum
     */
    public int getMin() {
        return min;
    }
    /**
     * @author Boudjedar Sabrina
     * la methode tri_tableau par selection  qui permet de trier les elements d'un tableau  
     * 
     */
    public void TriSelect(){
        for (int i=0;i<=tab.length-1;i++){ 
            int m=i;
            for(int j=i+1;j<=tab.length;j++){
                if (tab[j]<tab[m]) 
                    m=j;
            }
            int tmp=tab[m];
            tab[m]=tab[i];
            tab[i]=tmp;
        }       
    }

    /**
     * @author Boudjedar Sabrina
     *la methode inverser tableau qui permet d'inverser les elements d'un tableau
     */
    public void Inverser(){
        int k=tab.length-1;
        for (int p=0;p<(tab.length)/2;p++){  
            int e=tab[p];
            tab[p]=tab[k];
            tab[k]=e;
            k--;
        }
    }

    /**
     * @author Boudjedar Sabrina
     * la methode somme permet de calculer la somme des elements de deux tableau 
     * cette methode lance une exception si les deux tableux n'ont pas la meme taille 
     * @param tab1
     * @param taille
     * @return tableau de la somme des deux tableau en entrée
     * @throws DiffirenteTailleException
     */
    public int[] Somme (int[] tab1,int taille) throws DiffirenteTailleException{ 
        int i;
        int[] result = new int[this.taille];
        if (taille!=this.taille) throw new DiffirenteTailleException();
        else{
           for ( i=0;i<this.taille;i++){
                result[i]=this.tab[i]+tab1[i];
           } 
        }
        return result;      
    }
    /**
     * @author Bouhenniche Sihem
     * la methode qui calcule simultanemant le max et le min 
     */
    public void maxETmin(){
        this.max=tab[0];
        this.min=tab[0];
        for (int i = 0; i < taille; i++) {
            if(this.max < tab[i])
                this.max = tab[i];
            if(this.min > tab[i])
                this.min = tab[i];
        }
    }
     /**
      * @author Bouhenniche Sihem
     *la méthode qui utilise une formule (la moyenne)
     * @return int la moyenne du vecteur
     */
    public int moyenne() {
        int result =0;
        for (int i = 0; i < this.taille; i++) {
            result+=this.tab[i];
        }
        result=result/taille;
        return result;
    }
}
