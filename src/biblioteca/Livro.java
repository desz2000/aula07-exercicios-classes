package biblioteca;

public class Livro
{
    String titulo;

    String autor;

    int anoPublicacao;

    String isbn;

    boolean emprestado;

    Livro(String titulo, String autor, int anoPublicacao, String isbn)
    {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;

        emprestado = false;
    }

    void emprestar()
    {
        if (estaEmprestado())
        {
            throw new IllegalStateException("O livro ja esta emprestado!");
        }

        emprestado = true;
    }

    void devolver()
    {
        if (!estaEmprestado())
        {
            throw new IllegalStateException("O livro ja esta emprestado!");
        }

        emprestado = false;
    }

    boolean estaEmprestado()
    {
        return emprestado;
    }
}