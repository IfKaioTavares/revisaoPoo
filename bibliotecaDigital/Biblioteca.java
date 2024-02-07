import java.util.ArrayList;
import java.util.List;

import err.ObjectAlreadyExist;

public class Biblioteca {
    List<Book> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public List<Book> getLivroByAuthor(String nomeAutor){
        List<Book> booksList = new ArrayList<>();
        for (Book book : livros) {
            if(book.getAutor().getNome().equals(nomeAutor)){
                booksList.add(book);
            }
        }
        return List.copyOf(booksList);
    }

    public List<Book> getLivroByCategoria(String categoria){
        List<Book> booksList = new ArrayList<>();
        for (Book book : livros) {
            if(book.getCategorias().contains(categoria)){
                booksList.add(book);
            }
        }
        return List.copyOf(booksList);
    }

    public List<Book> getLivros() {
        return List.copyOf(livros);
    }

    public void addLivro(Book livro)throws ObjectAlreadyExist{
        if(!livros.contains(livro)){
            livros.add(livro);
        }else{
            throw new ObjectAlreadyExist();
        }
    }
}
