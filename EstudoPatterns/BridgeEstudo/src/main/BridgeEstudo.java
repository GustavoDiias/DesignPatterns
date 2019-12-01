
package main;

import bridgeestudo.Cript;
import bridgeestudo.Relatorio;

public class BridgeEstudo {

    public static void main(String[] args) {
        
        Relatorio r = new Cript();
        r.setTipo(new TXT());
        r.gerar();
    }
    
}
