/*
 * La class DiffrenteTailleException
 *  pour gérer l'exception de la taille diffirente des tableaux.
 */
package igl_tp;

/**
 *
 * @author khaled_mhz
 */
public class DiffirenteTailleException extends Exception{

    /**
     *le constructeur qui affiche un message d'erreur
     */
    public DiffirenteTailleException() {
        System.out.println("la taille des tableaux n'est pas la meme");
        this.printStackTrace();
    }

    /**
     *Redifinition de la methode getMessage
     * @return
     */
    @Override
    public String getMessage() {
        super.getMessage();
        return ("la taille des tableaux n'est pas la meme");  
    }
}