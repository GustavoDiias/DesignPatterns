
package aula2;

public class Pessoa {
    
    private String nome;
    
    private Endereco endereco;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
    
    public Endereco getEndereco(){
        return endereco;
    }
    
    public String getRua(){
        return this.endereco.getRua();
    }
}
