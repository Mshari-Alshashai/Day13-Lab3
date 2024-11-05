import java.util.List;

public class Novel extends Book{

    private String genre;

    public Novel(int stock, String genre) {
        super(stock);
        this.genre = genre;
    }

    public Novel(String title, String author, String ISBN, double price, int stock, String genre) {
        super(title, author, ISBN, price, stock);
        this.genre = genre;
    }

    public Novel(String genre) {
        this.genre = genre;
    }

    public Novel() {}

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()>4.5) return "Bestselling Novel";
        else return "Novel";
    }

    @Override
    public String toString() {
        return super.toString()+"\nGenre: "+genre;
    }
}
