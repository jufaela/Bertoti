import java.util.ArrayList;
import java.util.List;

public class JogoSubject implements InterfaceJogo{

    private String assinatura;
    private String atualizacao;
    private List<AssinanteObserver> assinantes = new ArrayList<AssinanteObserver>();

    public JogoSubject(String assinatura, String atualizacao) {
        this.assinatura = assinatura;
        this.atualizacao = atualizacao;
    }

    @Override
    public void addAssinante(AssinanteObserver assinante) {
      assinantes.add(assinante);
    }

    @Override
    public void removeAssinante(AssinanteObserver assinante) {
      assinantes.remove(assinante);
    }

    @Override
    public void notifyAllAssinatura() {
       for(AssinanteObserver assinante : assinantes){
        assinante.updateAssinatura(assinatura);
       }
    }

    @Override
    public void notifyAllAtualizacao() {
        for(AssinanteObserver assinante : assinantes){
            assinante.updateAtualizacao(atualizacao);
        }
       
    }
}
