
package proxy;

public class PlayerAnuncio implements Player{

    @Override
    public void play() {
        System.out.println("Tocando Anuncio ...");
        new PlayerMusica().play();
    }
    
}
