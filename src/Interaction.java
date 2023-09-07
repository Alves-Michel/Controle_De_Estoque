import java.util.ArrayList;
import java.util.Scanner;

public class Interaction {

    public static void main(String[] args)
    {
        ArrayList<Product> produtoPrincipal = new ArrayList<Product>();
        Scanner leitor = new Scanner(System.in);
        Product produto = new Product();

        while(true){
            System.out.println("____________________________________");
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastro de Produtos");
            System.out.println("2 - Consulta de Produtos");
            System.out.println("3 - Atuliazação de Estoque");
            System.out.println("4 - Cálculo de valor total de estoque");
            System.out.println("5 - Listagem de Produtos");
            System.out.println("6 - Remoção de Produtos");
            System.out.println("7 - Encerramento do programa");
            System.out.println("____________________________________");

            int option = leitor.nextInt();

            if(option == 7){
                System.out.println("Obrigado por ultilizar nosso sistema. tenha um otimo dia.");
                break;
            }

            switch (option){
                case 1:
                    System.out.println("____________________________________");
                    System.out.println("Nome do Produto: ");
                    String nomeProduto = leitor.next();
                    System.out.println("Preço do produto: " );
                    double precoProduto = leitor.nextDouble();
                    System.out.println("Quantidade de produtos: ");
                    int quantidadeProduto = leitor.nextInt();
                    System.out.println("Codigo do produto");
                    int codigoProduto = leitor.nextInt();

                    Product novoProduto = new Product(nomeProduto, precoProduto, quantidadeProduto, codigoProduto);
                    produtoPrincipal.add(novoProduto);
                    break;


                case 2:
                    System.out.println("____________________________________");
                    System.out.println("Digite o codigo do produto a ser consultado:");
                    int codigoConsulta = leitor.nextInt();
                   produto = null;

                    for (Product c : produtoPrincipal) {
                        if(c.getCodigo() == codigoConsulta){
                            produto = c;
                            break;
                        }
                    }
                    if(produto == null){
                        System.out.println("Produto nao encontrado: ");
                        break;
                    }
                    System.out.println(produto.toString());

                    break;

                case 3 :
                    System.out.println("____________________________________");
                    System.out.println("Digite o codigo do produto: ");
                    int codigo = leitor.nextInt();
                     produto = null;

                    for (Product c : produtoPrincipal) {
                        if(c.getCodigo() == codigo){
                            produto = c;
                            break;
                        }
                    }
                    if(produto == null){
                        System.out.println("Produto nao encontrado: ");
                        break;
                    }

                    System.out.println("Digite a quantidade que deseja adicionar:");
                    int amountAtualizado = leitor.nextInt();
                    produto.AdcionarProdutos(amountAtualizado);
                    break;

                case 4:
                    System.out.println("____________________________________");
                    double ValorTotalEmEstoque = 0;
                    for ( Product c : produtoPrincipal) {
                        produto = c;
                        ValorTotalEmEstoque += produto.CalcularTotalEmEstoque();
                    }
                    System.out.println("Valor total do estoque: R$" + ValorTotalEmEstoque);
                    break;

                case 5:
                    System.out.println("____________________________________");
                    System.out.println("Lista de Produtos em Estoque:");

                    for (Product p : produtoPrincipal) {
                        System.out.println(p);
                    }
                    break;

                case 6 :
                    System.out.println("____________________________________");
                    System.out.println("Digite o código do produto que deseja remover: ");
                    int codigoProduto2 = leitor.nextInt();
                    Product produtoParaRemover = null;

                    for (Product p : produtoPrincipal) {
                        if (p.getCodigo() == codigoProduto2) {
                            produtoParaRemover = p;
                            break;
                        }
                    }

                    if (produtoParaRemover != null) {
                        produtoPrincipal.remove(produtoParaRemover);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
            }
        }
    }
}
