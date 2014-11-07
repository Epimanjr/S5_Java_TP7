/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probleme;

/**
 *
 * @author Maxime
 */
public class Ecouteur {
    
    public int nb;
    
    public Ecouteur() {
        this.nb = 0;
    }
    
    public void ecouter() {
        nb++;
        System.out.println("Nombre : " + nb);
    }
}
