public class Teste {
    public static void main(String[] args) {
        JogoSubject jogoSubject = new JogoSubject("pacote 1 - R$5", "extensão visão noturna");
        AssinanteObserver JUJU = new AssinanteObserver();

        jogoSubject.addAssinante(JUJU);

        jogoSubject.notifyAllAssinatura();

        jogoSubject.removeAssinante(JUJU);

    }
}
