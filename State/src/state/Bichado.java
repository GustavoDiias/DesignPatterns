
package state;

public class Bichado implements Estado{
    
    @Override
    public void atirar(){
        System.out.println("\nAtirando Lentamente");
    }
    
    @Override
    public void mover(){
        System.out.println("Movendo Lentamente");
    }
}
