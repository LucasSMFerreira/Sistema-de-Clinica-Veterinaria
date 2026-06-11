import java.util.ArrayList;
import java.util.List;

public class Atendimento {

    private Situacao situacao;
    private List<Observador> observadores = new ArrayList<>();

    public Atendimento() {
        this.situacao = new Agendado();
    }

    public void adicionarObservador(Observador o) {
        observadores.add(o);
    }

    public void alterarSituacao(Situacao nova) {
        situacao.alterarSituacao(this, nova);
    }

    public void setSituacao(Situacao nova) {
        this.situacao = nova;
        notificar("Situação alterada para "
                + nova.getClass().getSimpleName());
    }

    private void notificar(String msg) {
        for (Observador o : observadores) {
            o.atualizar(msg);
        }
    }
}