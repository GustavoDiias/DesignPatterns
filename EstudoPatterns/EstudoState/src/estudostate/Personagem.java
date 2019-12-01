
package estudostate;

public class Personagem {
    
    private Estado estado = new Normal();
    
    private int vida = 100;

    public void atira(){
        this.estado.atira();
    }
    
    public void corre(){
        this.estado.corre();
    }
    
    public void vida(){
        System.out.println("Vida:"+vida);
    }
    
    public void caiuNoBuraco(){
       this.estado = new Morrendo();
       vida = 20;
   }
    
    public void saiuDoBuraco(){
        this.estado = new Normal();
    }
    
    public void bugou(){
        vida = 999999999;
        this.estado =  new Bugado();
    }
    
    public void estadoTomouDano(int dano){
        this.vida = vida - dano;
        if(this.vida < 20){
            this.estado = new Morrendo();
        }else if (this.vida > 100){
            this.estado = new Bugado();
        }else{
            this.estado = new Normal();
        }
    }
    
    
}
