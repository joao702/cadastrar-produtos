import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoPerecivel extends Produto {
    LocalDate dataAtual = LocalDate.now();
    String dataValidade;
    DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    int validadeInt;

    int anoAtual = dataAtual.getYear();


    public ProdutoPerecivel(String nome, float preco, int quantidade, String dataValidade, int validadeInt) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade.format(String.valueOf(formatarData));
        this.validadeInt = Integer.parseInt(dataValidade);


    }

    public void validade(){
        if (validadeInt < anoAtual) {
            System.out.println("Este produto está vencido!");
        }else {
            System.out.println("Este produto está dentro da validade!");
        }


    }
}