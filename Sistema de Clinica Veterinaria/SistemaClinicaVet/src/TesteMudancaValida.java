public class TesteMudancaValida {

    public static void main(String[] args) {

        Atendimento atendimento = new Atendimento();

        atendimento.alterarSituacao(new EmAtendimento());

        System.out.println("Teste de mudança válida concluído.");
    }
}