public class TesteMudancaInvalida {

    public static void main(String[] args) {

        Atendimento atendimento = new Atendimento();

        atendimento.alterarSituacao(new EmAtendimento());

        atendimento.alterarSituacao(new Cancelado());
    }
}