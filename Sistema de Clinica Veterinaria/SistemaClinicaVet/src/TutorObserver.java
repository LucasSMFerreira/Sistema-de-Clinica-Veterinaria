public class TutorObserver implements Observador {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Tutor recebeu: " + mensagem);
    }
}