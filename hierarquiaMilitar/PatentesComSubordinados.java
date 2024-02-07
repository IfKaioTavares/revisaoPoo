import java.util.ArrayList;
import java.util.List;

public abstract class PatentesComSubordinados extends Militar implements IMilitarHierarquia {
    private List<Militar> subordinados;

    public PatentesComSubordinados(String nome, int tempoServico) {
        super(nome, tempoServico);
        this.subordinados = new ArrayList<>();
    }


    @Override
    public List<Militar> getSubordinado() {
        return List.copyOf(subordinados);
    }

    @Override
    public void addSubordinado(Militar militar){
        if(!subordinados.contains(militar)){
            subordinados.add(militar);
            militar.setImediato(this);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((subordinados == null) ? 0 : subordinados.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        PatentesComSubordinados other = (PatentesComSubordinados) obj;
        if (subordinados == null) {
            if (other.subordinados != null)
                return false;
        } else if (!subordinados.equals(other.subordinados))
            return false;
        return true;
    }

    
}
