import java.util.ArrayList;
import java.util.List;

public class ServicoDeEntrega {
    private List<Fretavel> fretaveis;

    public ServicoDeEntrega(){
        this.fretaveis = new ArrayList<>();
    }

    public void addFretavel(Fretavel fretavel){
        fretaveis.add(fretavel);
    }
    public double calcularCustoTotal(double distanciaEmKm){
        double total = 0;
        for(Fretavel f : fretaveis){
            total += f.calcularCustoFrete(distanciaEmKm); // Exemplo com 10 km
        }
        return total;
    }

    public List<Fretavel> getFretaveis() {
        return fretaveis;
    }

    public void setFretaveis(List<Fretavel> fretaveis) {
        this.fretaveis = fretaveis;
    }
}
