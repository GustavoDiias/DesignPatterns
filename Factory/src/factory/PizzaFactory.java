
package factory;

public class PizzaFactory {
    
    public Pizza criaPizza(String sabor){
       if(sabor.equalsIgnoreCase("Calabresa")){
           return new Calabresa();
       }else if (sabor.equalsIgnoreCase("Moda")){
           return new Moda();
       }
       return new PizzaNula();
    }
}
