public class Tenente extends PatentesComSubordinados {
    public Tenente(String nome, int tempoServico) {
        super(nome, tempoServico);
    }

    private Capitao imediato;

    public void addImediato(Capitao capitao){
        this.imediato = capitao;
        capitao.addSubordinado(this);
    }

}
