package biblioteca;

public class TesteBiblioteca {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.registrarLivro(151);
   Livro l2 = new Livro();
   l2.registrarLivro(636, "Harry Potter");
   Livro l3 = new Livro();
   l3.registrarLivro(6365, "a song of ice and fire", "George r. r Martin", "fantasia");
    }

}
