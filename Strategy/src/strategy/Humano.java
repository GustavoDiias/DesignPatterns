
package strategy;

public class Humano {
    
    private ModoDeComer modo;

    public void setModo(ModoDeComer modo) {
        this.modo = modo;
    }

    public void comer(){
        this.modo.come();
    }
    
    
}
