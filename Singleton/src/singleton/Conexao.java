
package singleton;

public class Conexao {   
    static Conexao instancia;

    private Conexao() {
     
    }
    
    static Conexao GetInstancia(){     
        if(instancia == null){
            instancia = new Conexao();
        }       
        return instancia;
    }

}
