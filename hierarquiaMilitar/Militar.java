public abstract class Militar{
    private String nome;
    private int tempoServico;
    private static int id;

    public Militar(String nome, int tempoServico){
        this.nome = nome;
        this.tempoServico = tempoServico;
        this.id++;
    }

    private Militar imediato;


    public String getNome() {
        return nome;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public static int getId() {
        return id;
    }

    public Militar getImediato(){
        return imediato;
    }

    @Override
    public String toString() {
        return "Militar [nome=" + nome + ", tempoServico=" + tempoServico + "id=" + id +"]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + tempoServico;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Militar other = (Militar) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tempoServico != other.tempoServico)
            return false;
        return true;
    }

    public void setImediato(Militar imediato) {
        this.imediato = imediato;
    }
    
}