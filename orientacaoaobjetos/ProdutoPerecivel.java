import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {

    LocalDate data = LocalDate.now();
    String dataProduto;
    LocalDate formatFabric;


    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataProduto) {
        super(nome, preco, quantidade);

        this.dataProduto = dataProduto;

        formatFabric = LocalDate.parse(dataProduto);

        int anoProduto = formatFabric.getYear();
        int anoAtual = data.getYear();
        int mesProduto = formatFabric.getMonthValue();
        int mesAtual = data.getMonthValue();

        if (anoProduto > anoAtual){
            System.out.println("O produto é valido!");

        }else if (anoProduto == anoAtual){
            if (mesProduto >= mesAtual){
                System.out.println("O produto é valido!");
            }else {
                System.out.println("O produto está vencido!");
            }
        }else{
            System.out.println("O produto está vencido!");
        }
    }

}