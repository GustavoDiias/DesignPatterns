
package estudostate;

public class Morrendo implements Estado{
    
    @Override
    public void corre() {
            System.out.println("Corre Lentamente");
    }

    @Override
    public void atira() {
        System.out.println("Atira Lento");
    }
    
}
