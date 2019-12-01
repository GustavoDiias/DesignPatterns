
package factory;

public class PizzaNula implements Pizza{
    
    @Override
    public void sabor(){
        System.out.println("Sabor Não Existe");
    }
}
