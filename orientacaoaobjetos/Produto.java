

public class Produto {
        private String nome;
        private final float preco;
        private int quantidade;

    public Produto (String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int tirarQuantidade() {
        return this.quantidade--;
    }

    public int inserirQuantidade() {
        return this.quantidade++;
    }

    public float calcularValorTotal(){
        return this.quantidade*this.preco;

    }
}
