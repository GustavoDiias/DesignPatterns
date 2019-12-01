
package estudostate;

public class EstudoState {

    public static void main(String[] args) {
        
        Personagem p = new Personagem();
        
        p.atira();
        p.corre();
        p.vida();
        
        p.bugou();
        p.atira();
        p.corre();
        p.vida();
        
        p.caiuNoBuraco();
        p.corre();
        p.vida();
        
        p.estadoTomouDano(5);
        p.atira();
        p.corre();
        p.vida();

    }
    
}
