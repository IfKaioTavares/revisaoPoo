public class Capitao extends PatentesComSubordinados {
    public Capitao(String nome, int tempoServico) {
        super(nome, tempoServico);
    }

    @Override
    public Militar getImediato() {
        return null;
    }
}
