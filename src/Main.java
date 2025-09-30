import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicoDeEntrega entrega10km = new ServicoDeEntrega();
        Funcionario f1 = new Funcionario("Gabriel", 22);
        Carro c1 = new Carro("ABC1234", 2025);
        entrega10km.addFretavel(f1);
        entrega10km.addFretavel(c1);
        System.out.println("Entrega de 10km feita por " + f1.getNome() +
                " em carro de placa " + c1.getPlaca() + ". Total: " + entrega10km.calcularCustoTotal(10)  + " R$.");

       ServicoDeEntrega entrega25km = new ServicoDeEntrega();
       Autonomo a1 = new Autonomo("Jose", 25);
       Motocicleta m1 = new Motocicleta("AAA1111", 2025);
       entrega25km.addFretavel(a1);
       entrega25km.addFretavel(m1);

       System.out.println("Entrega de 25km feita por " + a1.getNome() +
                " em moto de placa " + m1.getPlaca() + ". Total: " + entrega25km.calcularCustoTotal(25) + " R$.");
    }
}