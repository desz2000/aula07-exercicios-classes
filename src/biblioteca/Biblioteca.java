package biblioteca;

import java.util.ArrayList;

public class Biblioteca
{
    ArrayList<Livro> acervo;

    Biblioteca()
    {
        acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro livro)
    {
        acervo.add(livro);
    }

    boolean removerLivroAcervo(String isbn)
    {
        for (Livro livro : acervo)
        {
            if (isbn.equals(livro.isbn))
            {
                acervo.remove(livro);
                return true;
            }
        }
        return false;
    }

    ArrayList<Livro> listaTodos()
    {
        return acervo;
    }

    ArrayList<Livro> listaEmprestados()
    {
        var emprestados = new ArrayList<Livro>();

        for (var livro : acervo)
        {
            if (livro.estaEmprestado())
            {
                emprestados.add(livro);
            }
        }

        return emprestados;
    }

    
    ArrayList<Livro> listaDisponiveis()
    {
        var disponiveis = new ArrayList<Livro>();

        for (var livro : acervo)
        {
            if (!livro.estaEmprestado())
            {
                disponiveis.add(livro);
            }
        }

        return disponiveis;
    }

}
