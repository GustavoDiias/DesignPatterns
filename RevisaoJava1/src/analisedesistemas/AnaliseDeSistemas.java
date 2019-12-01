
package analisedesistemas;

public class AnaliseDeSistemas {

    public static void main(String[] args) {
        Animal a = new Cachorro();
        a.som();
        a.movimentar();
        
        Animal b = new Gato();
        b.som();
        b.movimentar();
        
        Animal c = new Caranguejo();
        c.som();
        c.movimentar();
        
        Animal d = new PastorAlemao();
        d.som();
        d.movimentar();
        
    }
    
}
