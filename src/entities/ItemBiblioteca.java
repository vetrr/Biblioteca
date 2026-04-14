package entities;

import entities.enums.Status;

public class ItemBiblioteca{
    private String titulo;
    private int anoPublicacao;
    Status status;

    public ItemBiblioteca(String titulo, int anoPublicacao){
        this.titulo=titulo;
        this.anoPublicacao=anoPublicacao;
        this.status=Status.DISPONIVEL;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Publicacao: " + anoPublicacao;
    }

}
