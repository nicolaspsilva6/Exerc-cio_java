
package entidades;

public class Produtos {

    public String nomes;
    public double preco;
    public int quantidade;

    public Produtos(String nomes, double preco, int quantidade) {
        this.nomes = nomes;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produtos(String nomes, double preco) {
        this.nomes = nomes;
        this.preco = preco;
    }

        public double valorTotalNoEstoque () {
            return preco * quantidade;
        }
        public void addProdutos ( int quantidade){
            this.quantidade += quantidade;
        }
        public void removeProdutos ( int quantidade){
            this.quantidade -= quantidade;
        }
        public String toString () {
            return nomes
                    + " $"
                    + String.format("%.2f", preco)
                    + "unidade" + quantidade
                    + "valor total no estoque: $"
                    + String.format("%.2f", valorTotalNoEstoque());
        }

    }