package biblioteca;

public  class Livro {
    private String nome;
    private String autor;
    private int isbn;
private String genero;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getIsbn() {
        return isbn;
    }

    public void registrarLivro(int isbn){
        setIsbn(isbn);
        System.out.println("o livro foi registrado com o ISBN " + this.getIsbn());
    }
    public  void registrarLivro(int isbn, String nome){
        setIsbn(isbn);
        setNome(nome);
        System.out.println("o livro foi registrado com o ISBN " + this.getIsbn() + " e o nome " + this.getNome());
    }
    public  void registrarLivro(int isbn, String nome, String autor, String genero){
        setIsbn(isbn);
        setNome(nome);
        setGenero(genero);
        setAutor(autor);
        System.out.println("o livro foi registrado com o ISBN " + this.getIsbn() + " e o nome do livro é: " + this.getNome() + " e o gênero é: " + this.getGenero() + " e o autor é: " + this.getAutor());
    }

}
