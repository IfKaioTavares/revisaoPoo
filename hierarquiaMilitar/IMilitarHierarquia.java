import java.util.List;

public interface IMilitarHierarquia {
    public List<Militar> getSubordinado();
    public void addSubordinado(Militar militar);
}
