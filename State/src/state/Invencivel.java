
package state;

public class Invencivel implements Estado{

    @Override
    public void atirar() {
        System.out.println("Atira Super Rapido");
    }

    @Override
    public void mover() {
        System.out.println("Move super Rapido");
    }
    
}
