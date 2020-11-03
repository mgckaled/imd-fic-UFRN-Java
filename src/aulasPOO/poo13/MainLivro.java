package aulasPOO.poo13;


public class MainLivro {
    public static void main(String[] args) {
        LivrosBiblioteca L1 = new LivrosBiblioteca();
        L1.setAutor("Machado de Assis");
        L1.setTitulo("Memória Postumas de Brás Cubas");
        L1.setEditora("Renascer");
        L1.setEdicao(2);
        LivrosBiblioteca.setGenero("Literatura2");

        System.out.println(L1.getAutor());
        System.out.println(L1.getTitulo());
        System.out.println(L1.getEditora());
        System.out.println(L1.getEdicao());
        System.out.println(L1.getClass());
        System.out.println(LivrosBiblioteca.getGenero());
    }
}
