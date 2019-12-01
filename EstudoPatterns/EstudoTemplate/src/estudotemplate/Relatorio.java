
package estudotemplate;

public abstract class Relatorio {
    
    private void Buscar(){
        System.out.println("Buscando o relatorio");
    }
    
    private void Calcular(){
        System.out.println("Calculando o relatorio");
    }
    
    protected abstract void Exportar();
    
    public void Gerar(){
        Buscar();
        Calcular();
        Exportar();
    }
}
