
package adapter;

public class Adaptador extends Velho{
    
    @Override
    public void desenha(int raio){
        Novo n = new Novo();
        n.desenhaColorido(raio, "Preto");
        
    }
}
