
package builder;

public class Builder {

    public static void main(String[] args) {
        
        Pessoa p = new PessoaBuilder()
                        .temONome("Gustavo")
                        .temAIdade(20)
                        .build();
        
        p.imprime();
    }
    
}
