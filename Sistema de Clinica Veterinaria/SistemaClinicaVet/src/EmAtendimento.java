public class EmAtendimento implements Situacao {

    @Override
    public void alterarSituacao(Atendimento atendimento, Situacao novaSituacao) {

        if (novaSituacao instanceof Finalizado) {
            atendimento.setSituacao(novaSituacao);
        } else {
            System.out.println("Mudança inválida!");
        }
    }
}