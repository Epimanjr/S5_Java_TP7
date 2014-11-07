package test;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import personne.Paysan;

/**
 *
 * @author Antoine
 */
public class testSerialisation {

    public static void main(String[] args) {
        //Création de 3 paysans
        Paysan[] paysans = {
            new Paysan(10, "Toto", "Raymond"),
            new Paysan(20, "Titi", "Robert"),
            new Paysan(30, "Tata", "André")
        };

        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("temp.txt"));
            for (Paysan p : paysans) {
                oos.writeObject(p);
            }
        } catch (Exception e) {
            
    }
}

}
