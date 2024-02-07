import java.util.ArrayList;
import java.util.List;

import err.ObjectAlreadyExist;

public class Autor {
    private List<Book> livros;
    private String nome;

    public Autor(String nome){
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public List<Book> getLivros() {
        return List.copyOf(livros);
    }

    public String getNome() {
        return nome;
    }

    public void addLivro(Book livro)throws ObjectAlreadyExist{
        if(!livros.contains(livro)){
            livros.add(livro);
        }else{
            throw new ObjectAlreadyExist();
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((livros == null) ? 0 : livros.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Autor other = (Autor) obj;
        if (livros == null) {
            if (other.livros != null)
                return false;
        } else if (!livros.equals(other.livros))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Autor [livros=" + livros + ", nome=" + nome + "]";
    }
}
