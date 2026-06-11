public class ValorBase implements ValorAtendimento {

    private double valor;

    public ValorBase(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor;
    }
}