public class Cancelado implements Situacao {

    @Override
    public void alterarSituacao(Atendimento atendimento, Situacao novaSituacao) {

        System.out.println("Atendimento cancelado não pode mudar.");
    }
}