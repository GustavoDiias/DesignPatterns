
package strategy;

public class Strategy {

    public static void main(String[] args) {
        
        Humano h = new Humano();
        ModoDeComer garfo = new Garfo();
        ModoDeComer hashi = new Hashi();
        
        h.setModo(garfo);
        h.comer();
        
        h.setModo(hashi);
        h.comer();
    }
    
}
