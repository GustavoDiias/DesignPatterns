
package state;

public class State {

    public static void main(String[] args) {
        
        Personagem p = new Personagem();
 /*      
        p.caiuNoBuraco();  
        p.atirar();
        p.mover();
        
        p.saiuDoBuraco();  
        p.atirar();
        p.mover();
 */       
        p.sofrerDano(20);
        p.atirar();
        p.mover();
        
        p.sofrerDano(71);
        p.atirar();
        p.mover();
        
        p.comeuEstrelinha();
        p.atirar();
        p.mover();
        
    }
}
