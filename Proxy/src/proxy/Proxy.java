
package proxy;

public class Proxy {

    public static void main(String[] args) {
        Player f = new PlayerAnuncio();
        f.play();
        
        Player p = new PlayerMusica();
        p.play();
    }
    
}
