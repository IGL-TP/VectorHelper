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
    protected int [] tab=new int [100];
    private int max = 0;
    private int min = 0; 
    /**
     * le constrecteur de la classe Vector Helper qui permet d'initialiser les attributs de cette classe
     * @param taille 
     * @param tab
     */
    public VectorHelper(int taille,int []tab) {
        this.taille = taille;
        this.tab=tab;
    }
    /**
     *récuperer la taille du tableau
     * @return
     */
    public int getTaille() {
        return taille;
    }

    /**
     *récuperer le tableau d'elements
     * @return
     */
    public int[] getTabElement() {
        return tab;
    }

    /**
     * recuperer le max 
     * @return
     */
    public int getMax() {
        return max;
    }

    /**
     *recuperer le min
     * @return
     */
    public int getMin() {
        return min;
    }
    /**
     * la methode tri_tableau par selection  qui permet de trier les elements d'un tableau  
     * 
     * @param tab
     */
    public void TriSelect(){
        for (int i=0;i<=tab.length-1;i++){ 
            int m=i;
            for(int j=i+1;j<=tab.length-1;j++){
                if (tab[j]<tab[m]) 
                    m=j;
            }
            int tmp=tab[m];
            tab[m]=tab[i];
            tab[i]=tmp;
        }       
    }

    /**
     *la methode inverser tableau qui permet d'inverser les elements d'un tableau
     * @param tab
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
     * la methode somme permet de calculer la somme des elements de deux tableau 
     * cette methode lance une exception si les deux tableux n'ont pas la meme taille 
     * @param tab1
     * @param tab2
     * @return
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
}