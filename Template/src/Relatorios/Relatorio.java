package Relatorios;


public abstract class Relatorio {
    
    private void Buscar(){
        System.out.println("Buscando ...");
    }
    
    private void Calcular(){
        System.out.println("Calculando ...");
    }
    
    protected abstract void Exportar();
    
    public void Gerar(){
        Buscar();
        Calcular();
        Exportar();
    }
}
