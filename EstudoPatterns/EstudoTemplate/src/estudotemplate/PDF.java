
package estudotemplate;

public class PDF extends Relatorio{
    
    @Override
    protected void Exportar(){
        System.out.println("Exportando relatorio para PDF");
    }
}
