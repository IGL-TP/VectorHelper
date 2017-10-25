
package igl_tp;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 *<b>La class VectorHelper : représentation d'un vecteur offrant des manipulations et basic opérations.</b>
 *<p>Les attributs : </p>
 *  <ul>
 *      <li>Un entier contenant le nombre d'éléments existants dans ce vecteur(taille).</li>
 *      <li>Un tableau d'entiers contenant les éléments du vecteur.</li>
 *      <li>Un entier contenant la maximum d'un vecteur.</li>
 *      <li>Un entier contenant la minimum d'un vecteur.</li>
 * </ul>
 * @see DiffirenteTailleException
 * @author Boudjedar Sabrina - Bouhenniche Sihem
 * @version 1.0
 */
public class VectorHelper {
    /**
     *La taille du vecteur, c'est un entier supérieur ou égal à 0.
     * @see VectorHelper#VectorHelper(int, int[]) 
     * @see VectorHelper#getTaille() 
     * @see VectorHelper#Somme(int[], int) 
     * @see VectorHelper#maxETmin() 
     * @see VectorHelper#moyenne() 
     */
    private int taille;

    /**
     *Le tableau d'entiers contenant les éléments du vecteur.
     * @see VectorHelper#VectorHelper(int, int[]) 
     * @see VectorHelper#getTabElements()
     * @see VectorHelper#TriSelect() 
     * @see VectorHelper#Inverser() 
     * @see VectorHelper#Somme(int[], int) 
     * @see VectorHelper#maxETmin() 
     * @see VectorHelper#moyenne()
     */
    private int [] tab=new int [100];
    
    /**
     *La valeur maximale du vecteur, c'est un entier supérieur ou égal à 0.
     * @see VectorHelper#getMax() 
     * @see VectorHelper#maxETmin() 
     */
    private int max = 0;
    
    /**
     *La valeur minimale du vecteur, c'est un entier supérieur ou égal à 0.
     * @see VectorHelper#getMin() 
     * @see VectorHelper#maxETmin() 
     */
    private int min = 0; 
    
    /**
     * <p>
     * Le constrecteur de la classe VectorHelper avec initialisation des attributs : 
     * <ul>
     *      <li>taille.</li>
     *      <li>tab</li>
     * </ul>
     * <p>
     * @param taille 
     *          La taille du vecteur.
     * @param tab
     *          Le tableau d'éléments.
     * @see VectorHelper#taille
     * @see VectorHelper#tab
     * @author Boudjedar Sabrina
     */
    public VectorHelper(int taille,int []tab) {
        this.taille = taille;
        this.tab=tab;
    }
    /**
     * Récuperer la taille du vecteur.
     * @see VectorHelper#taille
     * @author Bouhenniche Sihem
     * @return int la taille du tableau
     */
    public int getTaille() {
        return taille;
    }

    /**
     * Récuperer le tableau d'elements du vecteur.
     * @see VectorHelper#tab
     * @author Bouhenniche Sihem
     * @return int[] tableau d'elements
     */
     public int [] getTab (){
         return tab;
       }
    /**
     * Récuperer la valeur maximale du vecteur.
     * @see VectorHelper#max
     * @author Bouhenniche Sihem
     * @return int maximum
     */
    public int getMax() {
        return max;
    }

    /**
     * Récuperer la valeur minimale du vecteur.
     * @see VectorHelper#min
     * @author Bouhenniche Sihem
     * @return int minimum
     */
    public int getMin() {
        return min;
    }
    /**
     *<p>
     * Trier les éléments du vecteur par sélection en ordre croissant.<br>
     * Exemple d'utilisation: </p>
     * <ul>
     *      <li>le vecteur vect : {4,2,1,5,3}</li>
     *      <li>vect.TriSelect();</li>
     *      <li>le vecteur vect devient : {1,2,3,4,5}</li>
     * </ul>
     * @see VectorHelper#tab
     * @author Boudjedar Sabrina
     */
    public void triSelection(){
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
     * <p>
     * Inverser les éléments du vecteur.<br>
     * Exemple d'utilisation: </p>
     * <ul>
     *      <li>le vecteur vect : {4,2,1,5,3}</li>
     *      <li>vect.Inverser();</li>
     *      <li>le vecteur vect devient : {3,5,1,2,4}</li>
     * </ul>
     * @see VectorHelper#tab
     * @author Boudjedar Sabrina
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
//Sabrina
    /**
     * <p>
     * Calculer la somme des éléments de deux vecteurs.<br> 
     * cette methode lance une exception si les deux tableux n'ont pas la meme taille.<br>
     * Exemple d'utilisation: </p>
     * <ul>
     *      <li>le vecteur vect : {4,2,1,5,3}</li>
     *      <li>les paramétres : tab1 {1,2,3,4,5} taille 5</li>
     *      <li>vect.Somme(tab1,taille);</li>
     *      <li>le resultat est : {5,4,4,9,8}</li>
     * </ul>
     * @param tab1 
     *          le tableau en entré
     * @param taille
     *          la taille du tableau en entré
     * @return int[] le resultat de la somme.
     * @throws DiffirenteTailleException déclanchement de l'exception DiffirenteTailleException
     * @see DiffirenteTailleException
     * @see VectorHelper#taille
     * @see VectorHelper#tab
     * @author Boudjedar Sabrina
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
  //---------
    /**
     * <p>
     * Calculer simultanemant le maximum et le minimum d'un vecteur. <br>
     *  Exemple d'utilisation: </p>
     * <ul>
     *      <li>le vecteur vect : {4,2,1,5,3}</li>
     *      <li>vect.maxETmin();</li>
     *      <li>max = 5 et min = 1</li>
     * </ul> 
     * @see VectorHelper#taille
     * @see VectorHelper#tab
     * @see VectorHelper#max
     * @see VectorHelper#min
     * @author Bouhenniche Sihem
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
      * <p>
      * Calculer la moyenne d'un vecteur.
      * Exemple d'utilisation: </p>
      * <ul>
      *      <li>le vecteur vect : {4,2,1,5,3}</li>
      *      <li>vect.moyenne();</li>
      *      <li>le resultat : (4+2+1+5+3)/5 = 3</li>
      * </ul>
      * @return int la moyenne du vecteur
      * @see VectorHelper#taille
      * @see VectorHelper#tab
      * @author Bouhenniche Sihem
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
