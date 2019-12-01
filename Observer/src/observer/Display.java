
package observer;

public class Display implements Observador{
    
    @Override
    public void notifica(){
        System.out.println("Mudou alguma coisa no Display");
    }
}
