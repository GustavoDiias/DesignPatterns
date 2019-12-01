
package composite;

public class Composite {

    public static void main(String[] args) {
        
        Produto shampoo = new Simples(3.50d, "Shampoo para cabelos secos");
        Produto condicionador = new Simples(8.50d, "Condicionador legal");
        Produto kit = new Composto(shampoo,condicionador);
        Produto sabonete = new Simples(0.5d,"Sabonete dove");
        Produto cesta = new Composto(sabonete, kit);
        
        //System.out.println(cesta.getDescricao()+" R$"+cesta.getPreco());
        
        CupomFiscal cupom = new CupomFiscal();
        cupom.adicionaProduto(cesta);
        cupom.adicionaProduto(kit);
        cupom.imprimeCupom();
    }
    
}
