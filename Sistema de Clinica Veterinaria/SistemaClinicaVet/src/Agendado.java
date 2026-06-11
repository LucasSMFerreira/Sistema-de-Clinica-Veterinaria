public class Agendado implements Situacao {

    @Override
    public void alterarSituacao(Atendimento atendimento, Situacao novaSituacao) {

        if (novaSituacao instanceof EmAtendimento ||
                novaSituacao instanceof Cancelado) {

            atendimento.setSituacao(novaSituacao);

        } else {
            System.out.println("Mudança inválida!");
        }
    }
}