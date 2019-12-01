
package bridgeestudo;

import main.TipoRelatorio;

public abstract class Relatorio {
    
    private TipoRelatorio tipo;

    public void setTipo(TipoRelatorio tipo) {
        this.tipo = tipo;
    }
    
    private void criando(){
        System.out.println("Criando o Relatorio");
    }
    
    private void salvando(){
        this.tipo.tipoRelatorio();
    }
    
    protected abstract void armazenando();
    
    public void gerar(){
        criando();
        salvando();
        armazenando();
    }
    
    
}
