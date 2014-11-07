package probleme;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copieur {

    public String source;

    public String destination;

    public ArrayList<Ecouteur> listeEcouteurs;

    public Copieur(String source, String destination) {
        this.source = source;
        this.destination = destination;
        this.listeEcouteurs = new ArrayList<>();

    }

    public void lancer() {
        try {
            /* Création des readers */
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);

            /* Appel de la méthode */
            copier(fr, fw);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copieur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            /* On prévient les écouteurs */
            for (Ecouteur e : this.listeEcouteurs) {
                e.total();
            }
        }
    }

    public void ajouterEcouteur(Ecouteur e) {
        this.listeEcouteurs.add(e);
    }

    public void copier(Reader source, Writer destination) throws IOException {
        System.out.println("*** COPIAGE DE " + this.source + " VERS " + this.destination + "***");
        // character stream 
        int c;
        while ((c = source.read()) != -1) {
            destination.write(c);

            /* On prévient les écouteurs */
            for (Ecouteur e : this.listeEcouteurs) {
                e.ecouter();
            }
        }
        /* On prévient les écouteurs */
        for (Ecouteur e : this.listeEcouteurs) {
            e.total();
        }
    }

    public static void main(String[] args) {
        Ecouteur ecouteur = new Ecouteur(5000);
        Ecouteur ecouteur2 = new Ecouteur(7000);

        Copieur copieur = new Copieur("source.txt", "destination.txt");
        copieur.ajouterEcouteur(ecouteur);
        copieur.ajouterEcouteur(ecouteur2);
        copieur.lancer();
    }

}
