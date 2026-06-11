public class TesteAvisoAutomatico {

    public static void main(String[] args) {

        Atendimento atendimento = new Atendimento();

        atendimento.adicionarObservador(new TutorObserver());
        atendimento.adicionarObservador(new VeterinarioObserver());

        atendimento.alterarSituacao(new EmAtendimento());
    }
}