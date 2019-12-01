package observer;

import java.util.ArrayList;
import java.util.List;

public class Observado {

    private List<Observador> observadores = new ArrayList<>();
    
    protected void notificaTodos() {
        for (Observador o : observadores) {
            o.notifica();
        }
    }
    
    protected void addObservador(Observador observador) {
        this.observadores.add(observador);
    }
}
