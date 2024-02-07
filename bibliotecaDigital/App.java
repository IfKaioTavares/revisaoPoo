public class App {
    public static void main(String[] args) {
        Biblioteca b1 = new Biblioteca();
        Autor a1 = new Autor("Tauynd");
        Autor a2 = new Autor("Kaio");
        Autor a3 = new Autor("Carlos");
        Book l1 = new Book("Sla1", "Terrros", a2);

        try{
            b1.addLivro(l1);
            b1.addLivro(new Book("Sla2", "Terrros", a3));
            b1.addLivro(new Book("Sla3", "Terrros", a1));
            b1.addLivro(new Book("oi", "mamar", a3));
            l1.addCategoria("Fadas");
            l1.addCategoria("Coelhos");
            l1.addCategoria("Coelhos");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }  

        System.out.println(b1.getLivroByAuthor("Carlos"));
        System.out.println(b1.getLivroByAuthor("Carrrrrloss"));
        System.out.println(b1.getLivroByCategoria("Fadas"));

    }
}
