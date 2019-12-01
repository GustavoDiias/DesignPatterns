
package state;

public class Personagem {
    
    private int vida = 100;
    
    private Estado estado = new Normal();
    
    public void atirar(){
        this.estado.atirar();
    }
    
    public void mover(){
        this.estado.mover();
    }
    
    public void caiuNoBuraco(){
        this.estado = new Bichado();
    }
    
    public void saiuDoBuraco(){
        this.estado = new Normal();
    }
    
    public void sofrerDano(int dano){
        this.vida = this.vida - dano;
        if(this.vida < 10){
            this.estado = new Bichado();
        }
    }
    
    public void comeuEstrelinha(){
        this.estado = new Invencivel();
        vida = 100;
        System.out.println("\nVida Atual:" + vida);
    }
}
