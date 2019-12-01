
package estudostate;

public class Normal implements Estado{
    
    @Override
    public void corre() {
        System.out.println("Corre Normal");
    }

    @Override
    public void atira() {
        System.out.println("Atira Normal");
    }
    
}
