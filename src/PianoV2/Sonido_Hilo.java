
package PianoV2;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfugue.player.Player;

public class Sonido_Hilo extends Thread{
    Player sonido;
    String nota;

    public Sonido_Hilo(Player sonido, String nota) {
        this.sonido = sonido;
        this.nota = nota;
    }
    
    @Override
    public void run (){
       
            sonido.play(nota);
  

    }
}
