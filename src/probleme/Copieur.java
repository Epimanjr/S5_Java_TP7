package probleme;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Copieur {
    
    public String source;
    
    public String destination;
    
    public Ecouteur ecouteur;

    public Copieur(String source, String destination, Ecouteur ecouteur) {
        this.source = source;
        this.destination = destination;
        this.ecouteur = ecouteur;
        
        try {
            /* Création des readers */
            FileReader fr = new FileReader(source);
            FileWriter fw = new FileWriter(destination);
            
            /* Appel de la méthode */
            copier(fr, fw);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copieur.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Copieur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    

    public void copier(Reader source, Writer destination) throws IOException {
        // character stream 
        int c;
        while ((c = source.read()) != -1) {
            destination.write(c);
            ecouteur.ecouter();
        }
    }
    
    
    public static void main(String[] args) {
        Ecouteur ecouteur = new Ecouteur();
        Copieur copieur = new Copieur("source.txt", "destination.txt", ecouteur);
    }

}
