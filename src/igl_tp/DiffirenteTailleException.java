/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igl_tp;

/**
 *
 * @author khaled_mhz
 */
public class DiffirenteTailleException extends Exception{

    public DiffirenteTailleException() {
        System.out.println("la taille des tableaux n'est pas la meme");
        this.printStackTrace();
    }
    @Override
    public String getMessage() {
        super.getMessage();
        return ("la taille des tableaux n'est pas la meme");  
    }
}