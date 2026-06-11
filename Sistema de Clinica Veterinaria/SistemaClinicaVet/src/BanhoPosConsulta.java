public class BanhoPosConsulta implements ValorAtendimento {

    private ValorAtendimento valor;

    public BanhoPosConsulta(ValorAtendimento valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor.calcular() + 30;
    }
}