
package observer;

public class Observer {

    public static void main(String[] args) {
        
        Termometro termometro = new Termometro();
        Barometro barometro = new Barometro();
        
        Display d = new Display();
        App a = new App();
        
        termometro.addObservador(a);
        termometro.addObservador(d);
        
        termometro.setTemperatura(100d);
        termometro.setTemperatura(105d);
        
        barometro.addObservador(new Display());
        barometro.setPressao(20d);
    }
    
}
