
package estudostrategy;

public class Humano {
    
    private ModoDeComer comendo;


    public void setComendo(ModoDeComer comendo) {
        this.comendo = comendo;
    }
    
    public void comer(){
        this.comendo.come();
    }
    
}
