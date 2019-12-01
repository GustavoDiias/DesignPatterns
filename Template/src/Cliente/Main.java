
package Cliente;

import Relatorios.Excel;
import Relatorios.PDF;
import Relatorios.Relatorio;

public class Main {

    public static void main(String[] args) {
        Relatorio r = new Excel();
        r.Gerar();
    }
    
}
