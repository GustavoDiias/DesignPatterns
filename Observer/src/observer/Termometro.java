
package observer;

public class Termometro extends Observado{
    
    private Double  temperatura;

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
        notificaTodos();
    }
    
    
}
