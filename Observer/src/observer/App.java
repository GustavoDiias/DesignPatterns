
package observer;

public class App implements Observador{
    
    @Override
    public void notifica(){
        System.out.println("Opa mudou o App");
    }
}
