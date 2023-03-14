public class AssinanteObserver implements InterfaceAssinante {

    @Override
    public void updateAssinatura(String assinatura) {
        System.out.println("novas atualizações de preços nos pacotes de assinatura " + assinatura);
    }

    @Override
    public void updateAtualizacao(String atualizacao) {
        System.out.println("nova extensão disponível " + atualizacao);
    }
    
}
