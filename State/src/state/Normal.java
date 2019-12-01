
package state;

public class Normal implements Estado{
    
    @Override
    public void atirar(){
        System.out.println("\nAtirando");
    }
    
    @Override
    public void mover(){
        System.out.println("Movendo");
    }
}
