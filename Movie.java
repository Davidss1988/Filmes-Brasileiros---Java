public class Movie {
    private final String name;
    private final String director;

    public Movie(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public boolean hasDirector(String name) {
        return director.toLowerCase().contains(name.toLowerCase());
    }

    @Override
    public String toString() {
        return "Filme: " + name + " | Diretor: " + director;
    }
}
