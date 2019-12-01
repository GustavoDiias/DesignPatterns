
package builder;

public class PessoaBuilder {
    
    private Pessoa pessoa = new Pessoa();
    
    public PessoaBuilder temONome(String nome){
        pessoa.setNome(nome);
        return this;
    }
    
    public PessoaBuilder temAIdade(int idade){
        pessoa.setIdade(idade);
        return this;
    }
    
    public Pessoa build(){
        return pessoa;
    }
}
