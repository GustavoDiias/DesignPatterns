
package bridge;

import bridge.arquivo.TXT;
import bridge.arquivo.RelatorioTemplate;

public class Bridge {

    public static void main(String[] args) {
    RelatorioTemplate r = new TXT();
    r.setModo(new ZIP());
    r.OrdemRelatorio();
    
    }
    
}
