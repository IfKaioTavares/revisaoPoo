import java.util.List;

public class Soldado extends Militar {

    public Soldado(String nome, int tempoServico) {
        super(nome, tempoServico);
    }

    private Cabo imediato;

    public void addImediato(Cabo cabo){
        this.imediato = cabo;
        cabo.addSubordinado(this);
    }
}
