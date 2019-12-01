package aula2;

public class Aula2 {

    public static void main(String[] args) {

        Endereco e = new Endereco();
        e.setRua("Algodao Doce");
        
        Pessoa p = new Pessoa();
        p.setEndereco(e);     
             
        System.out.println(p.getRua());
    }
    
}
