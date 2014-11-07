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
    
    public int seuil;

    public Ecouteur(int s) {
        this.nb = 0;
        this.seuil = s;
    }

    public void ecouter() {
        nb++;
        if (nb == seuil) {
            System.out.println("Bloc de " + seuil + " lu.");
            
            nb = 0;
        }
    }

}
