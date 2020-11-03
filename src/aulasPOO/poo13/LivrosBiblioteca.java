package aulasPOO.poo13;

public class LivrosBiblioteca {

    // Atributo de classe
    public static String genero;

    private String titulo;
    private String autor;
    private String editora;
    private int edicao;

    // Método construtor -> atributo de classe
    public LivrosBiblioteca() {}

    public LivrosBiblioteca(String titulo, String autor, String editora, int edicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
    }

    public static String getGenero() {
        return genero;
    }

    public static void setGenero(String genero) {
        LivrosBiblioteca.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}