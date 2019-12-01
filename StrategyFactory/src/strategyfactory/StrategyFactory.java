
package strategyfactory;

public class StrategyFactory {

    public static void main(String[] args) {
        IdiomasFactory factory = new IdiomasFactory();
        
        Idioma idioma = factory.criarIdioma("Us");
        Idioma idioma2 = factory.criarIdioma("Brasil");
        
        Sistema sistema = new Sistema();
        
        sistema.setIdioma(idioma);
        sistema.mensagemSair();
        
        sistema.setIdioma(idioma2);
        sistema.mensagemSair();
    }
    
}
