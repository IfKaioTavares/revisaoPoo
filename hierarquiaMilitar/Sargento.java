public class Sargento extends PatentesComSubordinados {
    public Sargento(String nome, int tempoServico) {
        super(nome, tempoServico);
    }

    private Tenente imediato;

    public void addImediato(Tenente tenente){
        this.imediato = tenente;
        tenente.addSubordinado(this);
    }

    @Override
    public Militar getImediato() {
        return imediato;
    }
}
