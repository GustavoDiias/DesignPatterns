
package strategyfactory;

public class Sistema {
    
    public Idioma idioma;
    
    public void mensagemSair(){
        idioma.sair();
    }
    public void setIdioma(Idioma idioma){
        this.idioma = idioma;
    }
}
