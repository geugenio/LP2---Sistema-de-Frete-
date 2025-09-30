public class Funcionario extends Entregador{
    double custoPorEntrega;

    public Funcionario(String nome, int idade) {
        super(nome, idade);
        this.custoPorEntrega = 5;
    }
}
