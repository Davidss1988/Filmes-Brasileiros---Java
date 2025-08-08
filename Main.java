
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Movie> allMovies = new ArrayList<>();

        allMovies.add(new Movie("O Auto da Compadecida", "Ariano Suassuna"));
        allMovies.add(new Movie("Tropa de Elite", "José Padilha"));
        allMovies.add(new Movie("Minha Mãe é uma Peça", "Paulo Gustavo"));
        allMovies.add(new Movie("Besouro", "João Daniel Tikhomiroff"));
        allMovies.add(new Movie("Cafundó", "Clóvis Bueno"));
        allMovies.add(new Movie("Cidade de Deus", "Fernando Meirelles"));
        allMovies.add(new Movie("Central do Brasil", "Walter Salles"));
        allMovies.add(new Movie("Bacurau", "Kleber Mendonça Filho"));
        allMovies.add(new Movie("Que Horas Ela Volta?", "Anna Muylaert"));
        allMovies.add(new Movie("O Palhaço", "Selton Mello"));
        allMovies.add(new Movie("O Homem que Copiava", "Júlio Bressane"));
        allMovies.add(new Movie("Lisbela e o Prisioneiro", "Guel Arraes"));
        allMovies.add(new Movie("2 Filhos de Francisco", "Bruno Barreto"));
        allMovies.add(new Movie("Tainá - Uma Aventura na Amazônia", "Tânia Lamarca"));
        allMovies.add(new Movie("Eu Receberia as Piores Notícias dos Seus Lindos Lábios", "Breno Silveira"));
        allMovies.add(new Movie("O Que é Isso, Companheiro?", "Bruno Barreto"));
        allMovies.add(new Movie("Carandiru", "Héctor Babenco"));
        allMovies.add(new Movie("Linha de Passe", "Walter Salles"));
        allMovies.add(new Movie("Amores Possíveis", "Sandra Werneck"));
        allMovies.add(new Movie("Vidas Secas", "Nelson Pereira dos Santos"));
        allMovies.add(new Movie("Tropa de Elite 2", "José Padilha"));
        allMovies.add(new Movie("Bicho de Sete Cabeças", "Laís Bodanzky"));
        allMovies.add(new Movie("O Ano em Que Meus Pais Saíram de Férias", "Cao Hamburger"));
        allMovies.add(new Movie("Babilônia 2000", "Daniel Filho"));
        allMovies.add(new Movie("O Quatrilho", "Fábio Barreto"));
        allMovies.add(new Movie("O Cheiro do Ralo", "Heitor Dhalia"));
        allMovies.add(new Movie("Se Eu Fosse Você", "Daniel Filho"));
        allMovies.add(new Movie("Estômago", "Marcos Jorge"));
        allMovies.add(new Movie("Carrossel das Rosas", "Walter Hugo Khouri"));
        allMovies.add(new Movie("2 Coelhos", "Afonso Poyart"));
        allMovies.add(new Movie("Bacurau", "Kleber Mendonça Filho"));
        allMovies.add(new Movie("Praia do Futuro", "Kleber Mendonça Filho"));
        allMovies.add(new Movie("Tropa de Elite 2", "José Padilha"));
        allMovies.add(new Movie("O Som ao Redor", "Kleber Mendonça Filho"));
        allMovies.add(new Movie("Aquarius", "Kleber Mendonça Filho"));
        allMovies.add(new Movie("Bicho de Sete Cabeças", "Laís Bodanzky"));
        allMovies.add(new Movie("Hoje Eu Quero Voltar Sozinho", "Daniel Ribeiro"));
        allMovies.add(new Movie("O Menino e o Mundo", "Alê Abreu"));
        allMovies.add(new Movie("Que Horas Ela Volta?", "Anna Muylaert"));
        allMovies.add(new Movie("Bingo: O Rei das Manhãs", "Daniel Rezende"));
        allMovies.add(new Movie("Linha de Passe", "Walter Salles"));
        allMovies.add(new Movie("Cidade Baixa", "Sérgio Machado"));
        allMovies.add(new Movie("Última Parada 174", "Bruno Barreto"));
        allMovies.add(new Movie("Carandiru", "Héctor Babenco"));
        allMovies.add(new Movie("O Ano em Que Meus Pais Saíram de Férias", "Cao Hamburger"));
        allMovies.add(new Movie("O Homem do Ano", "José Henrique Fonseca"));
        allMovies.add(new Movie("Se Deus Vier, Que Venha Armado", "José Mojica Marins"));
        allMovies.add(new Movie("Lavoura Arcaica", "Luiz Fernando Carvalho"));
        allMovies.add(new Movie("O Som ao Redor", "Kleber Mendonça Filho"));
        allMovies.add(new Movie("Bicho de Sete Cabeças", "Laís Bodanzky"));
        allMovies.add(new Movie("O Beijo da Mulher Aranha", "Héctor Babenco"));
        allMovies.add(new Movie("Vidas Secas", "Nelson Pereira dos Santos"));
        allMovies.add(new Movie("Terra Estrangeira", "Walter Salles"));
        allMovies.add(new Movie("Os Inquilinos", "Sérgio Bianchi"));
        allMovies.add(new Movie("O Quatrilho", "Fábio Barreto"));
        allMovies.add(new Movie("Estômago", "Marcos Jorge"));
        allMovies.add(new Movie("Tropa de Elite", "José Padilha"));
        allMovies.add(new Movie("Cidade de Deus", "Fernando Meirelles"));
        allMovies.add(new Movie("Central do Brasil", "Walter Salles"));
        allMovies.add(new Movie("Carandiru", "Héctor Babenco"));
        allMovies.add(new Movie("O Palhaço", "Selton Mello"));
        allMovies.add(new Movie("Colegas", "André Ristum"));
        allMovies.add(new Movie("Cronicamente Inviável", "Sérgio Bianchi"));
        allMovies.add(new Movie("Malu de Bicicleta", "Flávia Moraes"));
        allMovies.add(new Movie("Hoje Eu Quero Voltar Sozinho", "Daniel Ribeiro"));
        allMovies.add(new Movie("Bingo: O Rei das Manhãs", "Daniel Rezende"));
        allMovies.add(new Movie("Que Horas Ela Volta?", "Anna Muylaert"));

        // Mostrar todos os filmes
        System.out.println("Todos os filmes:");
        for (Movie movie : allMovies) {
            System.out.println(movie);
        }

        // Filtrar filmes dirigidos por José Padilha, por exemplo
        String diretorFiltro = "José Padilha";
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : allMovies) {
            if (movie.hasDirector(diretorFiltro)) {
                filteredMovies.add(movie);
            }
        }

        // Ordenar por nome do filme
        filteredMovies.sort(Comparator.comparing(Movie::getName));

        System.out.println("\nFilmes dirigidos por " + diretorFiltro + ":");
        for (Movie movie : filteredMovies) {
            System.out.println(movie);
        }
    }
}
