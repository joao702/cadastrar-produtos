

public class Produto {
        String nome;
        private double preco;
        private int quantidade;
        int receQuantidade;
        int minQuantidade;

        public void produto(){

        }

    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    public int tirarQuantidade(int minQuantidade) {
        if(quantidade > 0){
            return quantidade - minQuantidade;
        }else{
            System.out.println("Quantidade insulficiente!");
        }

        return quantidade;
    }

    public int inserirQuantidade(int receQuantidade) {
        return quantidade + receQuantidade;
    }

    public double calcularValorTotal(){
        return quantidade*preco;

    }
}
