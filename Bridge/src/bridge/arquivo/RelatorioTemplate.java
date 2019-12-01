
package bridge.arquivo;

import bridge.ModoStrategy;

public abstract class RelatorioTemplate {
    
    private ModoStrategy modo;
    
    private void Buscar(){
        System.out.println("Buscando ...");
    }
    
    protected abstract void Exportar();
    
    protected void Finalizar(){
        modo.Finalizar();
    }
    public void OrdemRelatorio(){
        Buscar();
        Exportar();
        Finalizar();
    }

    public void setModo(ModoStrategy modo) {
        this.modo = modo;
    }

    public ModoStrategy getModo() {
        return modo;
    }
    
    
    
    
}
