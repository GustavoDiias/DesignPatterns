
package estudobridge;

import Teste.ModoDeComer;

public abstract class Relatorio {
    
    private ModoDeComer modo;
    
    public void setModo(ModoDeComer modo) {
        this.modo = modo;
    }
    
    private void Mesa(){
        System.out.println("Na Mesa");
    }
    
    protected abstract void TipoRefeicao();
    
    private void Utensilho(){
        modo.come();
    }
    
    public void Gerar(){
        Mesa();
        TipoRefeicao();
        Utensilho();
    }
    
    
}
