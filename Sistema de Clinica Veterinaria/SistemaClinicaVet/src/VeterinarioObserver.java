public class VeterinarioObserver implements Observador {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Veterinário recebeu: " + mensagem);
    }
}