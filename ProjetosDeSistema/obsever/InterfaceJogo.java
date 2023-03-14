public interface InterfaceJogo {
    public void addAssinante(AssinanteObserver assinante);
    public void removeAssinante(AssinanteObserver assinante);
    public void notifyAllAssinatura();
    public void notifyAllAtualizacao();
}
