public class RecepcaoObserver implements Observador {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Recepção recebeu: " + mensagem);
    }
}