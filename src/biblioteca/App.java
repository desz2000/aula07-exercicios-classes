package biblioteca;

public class App
{
    public static void main(String[] args)
    {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("O Senhor dos Aneis", "JRR Tolkien", 1954, "123");
        Livro livro2 = new Livro("O Hobbit", "JRR Tolkien", 1937, "456");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "789");
        Livro livro4 = new Livro("Guerra e Paz", "Lievy Tolstoi", 1869, "325");
        Livro livro5 = new Livro("Cem Anos de Solidao", "Gabriel Garcia Marquez", 1967, "961");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();

        livro1.devolver();
    
        System.out.println(livro2.converteParaString());

        System.out.println("Livros disponiveis: ");
        for (Livro livro : biblioteca.listaDisponiveis())
        {
            System.out.println(livro.converteParaString());
        }

        System.out.println("Livros emprestados: ");
        for (Livro livro : biblioteca.listaEmprestados())
        {
            System.out.println(livro.converteParaString());
        }
    }
}
