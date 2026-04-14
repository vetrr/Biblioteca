package entities;

public class Hq extends ItemBiblioteca{
    private String editora;
    private String artista;

    

    public Hq(String titulo, int anoPublicacao, String editora, String artista) {
        super(titulo, anoPublicacao);
        this.editora = editora;
        this.artista = artista;
    }

    public String getEditora() {
        return editora;
    }
    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return super.toString() +", Hq editora: " + editora + ", artista: " + artista;
    }
}
