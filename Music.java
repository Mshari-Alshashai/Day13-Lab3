import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Music extends Media{

    private String artist;

    public Music() {}

    public Music(String artist) {
        this.artist = artist;
    }

    public Music(String title, String artist, String ISBN, double price) {
        super(title, artist, ISBN, price);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
        user.addToCart(this);
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog){
        return musicCatalog.stream().filter(Music -> Music.getArtist().equalsIgnoreCase(artist)).collect(Collectors.toList());
    }

    @Override
    public String getMediaType() {
        if(getPrice()>10) return "Premium Music";
        else return "Music";
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\nArtist: " + artist + "\nISBN: " + getISBN() + "\nPrice=" + getPrice();
    }
}
