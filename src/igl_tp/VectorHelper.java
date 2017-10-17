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
  public void Inverser(int []tab)
{   int k=tab.length-1;
    for (int p=0;p<(tab.length)/2;p++)
    {  int e=tab[p];
        tab[p]=tab[k];
        tab[k]=e;
        k--;
    }
   
}
  public int[] Somme (int[] tab1,int[]tab2) throws Exeption
{    int[] tab3 = new int[tab1.length] ; int i;
 try
 {  
     if (tab1.length!=tab2.length) throw new Exeption();
 }
 catch(ArrayIndexOutOfBoundsException ex )
 {
      
 }
 
   for ( i=0;i<min (tab1.length,tab2.length);i++)
   {
    tab3[i]=tab1[i]+tab2[i];
   }

 return tab3;      
}
}