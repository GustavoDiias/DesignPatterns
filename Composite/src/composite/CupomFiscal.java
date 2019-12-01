
package composite;

import java.util.ArrayList;
import java.util.List;

public class CupomFiscal{
    
    private List<Produto> produtos = new ArrayList();

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void imprimeCupom(){      
        for(Produto produto: produtos){
            System.out.println(produto.getDescricao()+ " = R$"+produto.getPreco());
        }
    }
    
    
    
    
}
