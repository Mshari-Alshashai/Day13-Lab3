import java.util.List;
import java.util.stream.Collectors;

public class Movie extends Media{

    private int duration;

    public Movie() {}

    public Movie(int duration) {
        this.duration = duration;
    }

    public Movie(String title, String author, String ISBN, double price, int duration) {
        super(title, author, ISBN, price);
        this.duration = duration;
    }

    public void watch(User user){user.addToCart(this);}

    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog){
        return movieCatalog.stream().filter(Movie -> Movie.getAuthor().equalsIgnoreCase(getAuthor())).collect(Collectors.toList());
    }

    @Override
    public String getMediaType() {
        if (duration>=120)return "Long Movie";
        else return "Movie";
    }

    @Override
    public String toString() {
        return super.toString()+"\nDuration: "+duration;
    }
}
