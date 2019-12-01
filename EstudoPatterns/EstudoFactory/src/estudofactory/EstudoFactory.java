
package estudofactory;

public class EstudoFactory {

    public static void main(String[] args) {
        
        FactoryPastel fac = new FactoryPastel();
        
        
        Pastel p = fac.criarPastel("Queijo");
        p.Sabor();
        
    }
    
}
