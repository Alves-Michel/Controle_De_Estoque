public class Product {

    public String NameProduct;
    public double Price;
    public int Amount;
    public int Codigo;

    public Product(){

    }
    public Product(String nameProduct, double price, int amount, int codigo) {
        NameProduct = nameProduct;
        Price = price;
        Amount = amount;
        Codigo = codigo;
    }

    public String getNameProduct() {
        return NameProduct;
    }

    public double getPrice() {
        return Price;
    }

    public int getAmount() {
        return Amount;
    }

    public int getCodigo() {
        return Codigo;
    }

    public double ValorEmEstoque(){
        return Price * Amount;
    }
    public double CalcularTotalEmEstoque(){
        return   Price * Amount;
    }

    public void AdcionarProdutos(int amout){
        Amount += amout;
        System.out.println("Produto adicionado com sucesso!");
    }

    public void RemoverProdutos(int amount){
        Amount -= amount;
        System.out.println("Produto removido com sucesso!");
    }

    @Override
    public String toString() {
        return "Código-" + Codigo +
                "- Produto: " + NameProduct +
                ", R$" + Price +
                ", Quantidade: " + Amount +
                ", Valor total do produto no estoque: R$"+ ValorEmEstoque();
    }
}
