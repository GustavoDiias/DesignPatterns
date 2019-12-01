
package factory;

public class Main {

    public static void main(String[] args) {
        
        PizzaFactory pizzaFactory = new PizzaFactory();
        
        Pizza p = pizzaFactory.criaPizza("moda");
        p.sabor();
    }
    
}
