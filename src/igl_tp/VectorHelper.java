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
 * @author khaled_mhz
 */
public class VectorHelper {
    private int taille;
    private int  tab[]=new int [100];

    public VectorHelper(int taille,int []tab) {
        this.taille = taille;
        this.tab=tab;
    }
  public void TriSelect(int []tab)
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
   
}