
package estudofactory;

public class FactoryPastel {
    
    public Pastel criarPastel(String sabor){
        if(sabor.equalsIgnoreCase("Frango")){
            return new Frango();
        }else if (sabor.equalsIgnoreCase("Queijo")){
            return new Queijo();
        }
        return new SemSabor();
    }
}
