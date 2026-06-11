public class Finalizado implements Situacao {

    @Override
    public void alterarSituacao(Atendimento atendimento, Situacao novaSituacao) {

        System.out.println("Atendimento finalizado não pode mudar.");
    }
}