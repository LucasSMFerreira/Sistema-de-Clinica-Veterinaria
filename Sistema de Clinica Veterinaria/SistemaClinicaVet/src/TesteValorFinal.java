public class TesteValorFinal {

    public static void main(String[] args) {

        ValorAtendimento valor =
                new BanhoPosConsulta(
                        new TaxaDomiciliar(
                                new DescontoAdocao(
                                        new ValorBase(100))));

        System.out.println("Valor final: R$ " + valor.calcular());
    }
}