public class Autonomo extends Funcionario implements Fretavel{
    public Autonomo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public double calcularCustoFrete(double distanciaEmKm) {
        return distanciaEmKm * 0.95;
    }
}
