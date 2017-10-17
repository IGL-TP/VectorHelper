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
     * la methode tri_tableau par selection  qui permet de trier les elements d'un tableau  
     * 
     * @param tab
     */
    public void TriSelect()
{
  for (int i=0;i<=tab.length-1;i++)
   { int m=i;
     for(int j=i+1;j<=tab.length-1;j++)
       { if (tab[j]<tab[m]) 
          m=j;
       }
         int tmp=tab[m];
         tab[m]=tab[i];
         tab[i]=tmp;}
           
 }

    /**
     *la methode inverser tableau qui permet d'inverser les elements d'un tableau
     * @param tab
     */
    public void Inverser()
{   int k=tab.length-1;
    for (int p=0;p<(tab.length)/2;p++)
    {  int e=tab[p];
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
     * @throws Exeption
     */
    public int[] Somme (int[] tab1,int taille) throws Exeption{ 
        int i;
        
        try
        {  
            if (taille!=this.taille) throw new Exeption();
        }
        catch(ArrayIndexOutOfBoundsException ex )
        {

        }
        int[] result = new int[this.taille];
        for ( i=0;i<this.taille;i++)
        {
            result[i]=this.tab[i]+tab1[i];
        }

        return result;      
}

}