
package Teste;

import estudobridge.Almoco;
import estudobridge.Relatorio;

public class EstudoBridge {


    public static void main(String[] args) {
        Relatorio r = new Almoco();
        r.setModo(new Garfo());
        r.Gerar();
        
    }
    
}
