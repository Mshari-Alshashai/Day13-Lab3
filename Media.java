public class Media {

    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Media() {}

    public Media(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=0) this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getMediaType(){
        return "Media";
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nAuthor: " + author + "\nISBN: " + ISBN + "\nPrice=" + price;
    }
}
