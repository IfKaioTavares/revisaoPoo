import java.util.ArrayList;
import java.util.List;

import err.ObjectAlreadyExist;

public class Book {
    private String nome;
    private List<String> categorias;
    private Autor autor;

    public Book(String name, String categoria, Autor autor){
        this.nome = name;
        this.categorias = new ArrayList<>();
        this.categorias.add(categoria);
        this.autor = autor;
        try{
            this.autor.addLivro(this);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getNome() {
        return nome;
    }

    public List<String> getCategorias() {
        return List.copyOf(categorias);
    }

    public void addCategoria(String categoria) throws ObjectAlreadyExist{
        if(!categorias.contains(categoria)){
            categorias.add(categoria);
        }else{
            throw new ObjectAlreadyExist("Livro");
        }
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((categorias == null) ? 0 : categorias.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
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
        Book other = (Book) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (categorias == null) {
            if (other.categorias != null)
                return false;
        } else if (!categorias.equals(other.categorias))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [nome=" + nome + ", categorias=" + categorias + ", autor=" + autor.getNome() + "]";
    }

    
}