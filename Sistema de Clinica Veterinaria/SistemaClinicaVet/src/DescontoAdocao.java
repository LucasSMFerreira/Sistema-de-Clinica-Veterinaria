public class DescontoAdocao implements ValorAtendimento {

    private ValorAtendimento valor;

    public DescontoAdocao(ValorAtendimento valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return valor.calcular() - 20;
    }
}