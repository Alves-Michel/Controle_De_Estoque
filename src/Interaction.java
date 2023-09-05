import java.util.ArrayList;
import java.util.Scanner;

public class Interaction {

    public static void main(String[] args)
    {
        ArrayList<Product> produtoPrincipal = new ArrayList<Product>();
        Scanner leitor = new Scanner(System.in);

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
                    String NameProduct = leitor.next();
                    System.out.println("Preço do produto: " );
                    double Price = leitor.nextDouble();
                    System.out.println("Quantidade de produtos: ");
                    int Amount = leitor.nextInt();
                    System.out.println("Codigo do produto");
                    int Codigo = leitor.nextInt();
                    Product produto = new Product(NameProduct, Price, Amount, Codigo);
                    produtoPrincipal.add(produto);
                    break;

                case 2:
                    System.out.println("____________________________________");
                    System.out.println("Digite o codigo do produto a ser consultado:");
                    int codigoConsulta = leitor.nextInt();
                    Product produtoConsulta = null;

                    for (Product c : produtoPrincipal) {
                        if(c.getCodigo() == codigoConsulta){
                            produtoConsulta = c;
                            break;
                        }
                    }
                    if(produtoConsulta == null){
                        System.out.println("Produto nao encontrado: ");
                        break;
                    }
                    System.out.println(produtoConsulta.toString());

                    break;

                case 3 :
                    System.out.println("____________________________________");
                    System.out.println("Digite o codigo do produto: ");
                    int codigoProduto = leitor.nextInt();
                    Product produtoSelcionado = null;

                    for (Product c : produtoPrincipal) {
                        if(c.getCodigo() == codigoProduto){
                            produtoSelcionado = c;
                            break;
                        }
                    }
                    if(produtoSelcionado == null){
                        System.out.println("Produto nao encontrado: ");
                        break;
                    }

                    System.out.println("Digite a quantidade que deseja adicionar:");
                    int amountAtualizado = leitor.nextInt();
                    produtoSelcionado.AdcionarProdutos(amountAtualizado);
                    break;

                case 4:
                    System.out.println("____________________________________");
                    break;

                case 5:
                    System.out.println("____________________________________");
                    System.out.println("Produtos em estoque: " + produtoPrincipal.toString());
                    break;

                case 6 :
                    System.out.println("____________________________________");


                    break;

            }






















        }

    }
}