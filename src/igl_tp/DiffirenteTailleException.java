
package igl_tp;

/**
 * <b>La class DiffirenteTailleException : excption lancé quand les taille des vecteurs sont différentes.</b>
 * @author Boudjedar Sabrina -Bouhenniche Sihem
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
     * @return string message d'erreur
     */
    @Override
    public String getMessage() {
        super.getMessage();
        return ("la taille des tableaux n'est pas la meme");  
    }
}