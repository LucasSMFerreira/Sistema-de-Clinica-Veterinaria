public class TaxaDomiciliar implements ValorAtendimento {

    private ValorAtendimento valor;

    public TaxaDomiciliar(ValorAtendimento valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor.calcular() + 50;
    }
}