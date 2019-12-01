
package Main;

import estudotemplate.PDF;
import estudotemplate.Relatorio;
import estudotemplate.TXT;

public class EstudoTemplate {

    public static void main(String[] args) {
        Relatorio r = new TXT();
        r.Gerar();
    }
    
}
