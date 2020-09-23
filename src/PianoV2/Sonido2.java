
package PianoV2;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfugue.player.Player;

public class Sonido2 extends Thread{
    Player sonido;
    String nota;

    public Sonido2(Player sonido, String nota) {
        this.sonido = sonido;
        this.nota = nota;
    }
    
    @Override
    public void run (){
        try {
            sonido.play(nota);
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            Logger.getLogger(Sonido2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
