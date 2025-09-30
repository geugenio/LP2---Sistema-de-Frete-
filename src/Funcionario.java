public class Funcionario extends Entregador implements Fretavel{
    public Funcionario(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return 5;
    }
}
