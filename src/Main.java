
import entidades.Produtos;
import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scn = new Scanner(System.in);




        System.out.println(" entre com o produto:");
        System.out.print("Nome do Produto: ");
         String  nomes = scn.nextLine();

        System.out.print("Digite o valor do produto: ");
         double preco = scn.nextDouble();

        Produtos produtos = new Produtos(nomes,preco );

        System.out.println("Lista de produtos: Nome: "+produtos);

        System.out.println("---------------------------------------");

        System.out.print("Digite uma quantidade para adicionar ao estoque");
        int quant = scn.nextInt();
        produtos.addProdutos(quant);

        System.out.println("--------------------------------------------");

        System.out.println("Atualização da lista de produtos:"+produtos);
        System.out.println("-------------------------------------------");

        System.out.println("Digite uma quantidade para remover do estique");
        int remove = scn.nextInt();

        produtos.removeProdutos(remove);

        System.out.println("Atualização 2 da lista de produtos"+produtos);


    }
}
