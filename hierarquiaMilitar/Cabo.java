public class Cabo extends PatentesComSubordinados {

    public Cabo(String nome, int tempoServico) {
        super(nome, tempoServico);
    }

    private Sargento imediato;

    @Override
    public Militar getImediato() {
        return imediato;
    }

    public void addImediato(Sargento sargento){
        this.imediato = sargento;
        sargento.addSubordinado(this);
    }
    
}
