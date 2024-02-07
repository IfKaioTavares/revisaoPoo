public class App {
    public static void main(String[] args) {
        Soldado s1 = new Soldado("Kaio", 1);
        Soldado s2 = new Soldado("Kaio2", 12);
        Soldado s3 = new Soldado("Kaio3", 13);
        Cabo c1 = new Cabo("Caboclo", 10);
        c1.addSubordinado(s1);
        
        s2.addImediato(c1);
        s3.addImediato(c1);
        c1.addSubordinado(s3);


        System.out.println("Imediato do Soldado " + s1.getNome() + " é :" + s1.getImediato().getNome());
        System.out
                .println("A quantidade de subordidados do Cabo " + c1.getNome() + " é :" + c1.getSubordinado().size());
    }
}
