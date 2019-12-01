
package estudostate;

public class Bugado implements Estado{

    @Override
    public void corre() {
        System.out.println("Corre todo BUGADO");
    }

    @Override
    public void atira() {
        System.out.println("Atira BUGADO");
    }
    
}
