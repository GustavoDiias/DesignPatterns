
package generics;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {
        
        List<Pessoa> l = new ArrayList<>();
 
        l.add(new Pessoa("Wander"));
        l.add(new Pessoa("WanderRE"));
        l.add(new Pessoa("WanderRage"));
        l.add(new Pessoa("WanderSa"));
        
        System.out.println("Tamanho " +l.size());
        
        for(Pessoa item : l){
            System.out.println(item.getNome());
        }
    }
}
