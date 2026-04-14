package entities;

public class Livro extends ItemBiblioteca{
    private int isbn;
    private int numeroPaginas;

    public Livro(String titulo, int anoPublicacao, int isbn, int numeroPaginas) {
        super(titulo, anoPublicacao);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Livro isbn: " + isbn + ", numero de paginas: " + numeroPaginas;
    }

    

}
