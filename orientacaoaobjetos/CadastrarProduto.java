public class CadastrarProduto{
    public static void main(String[] args) {
        Produto p1 = new ProdutoPerecivel("café", 30.50, 10, "2027-06-22");
        Produto p2 = new ProdutoPerecivel("Leite", 6.99 , 18, "2026-05-23");

        p1.mostrarInfo();
        p2.mostrarInfo();
    }

}