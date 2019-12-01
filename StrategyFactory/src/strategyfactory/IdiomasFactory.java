
package strategyfactory;

public class IdiomasFactory {
    public Sistema sistema;
    
    public Idioma criarIdioma(String pais){
        if(pais.equalsIgnoreCase("Brasil")){
            return new Br();
        }else if (pais.equalsIgnoreCase("Us")){
            return new Us();
        }
      return new Us();      
    }
    
}
