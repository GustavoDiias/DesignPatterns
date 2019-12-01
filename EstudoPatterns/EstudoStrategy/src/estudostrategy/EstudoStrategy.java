
package estudostrategy;

public class EstudoStrategy {

    public static void main(String[] args) {
        //Instanciado o Humano
        Humano h = new Humano();
        //Setando o Modo de Comer do Humano
        h.setComendo(new Garfo());
        //Mostrando o Modo de Comer
        h.comer();
        
    }
    
}
