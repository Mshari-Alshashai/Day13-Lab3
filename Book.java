import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

    private int stock;
    private List<Review> reviews=new ArrayList<>();

    public Book() {}

    public Book(int stock) {
        this.stock = stock;
    }

    public Book(String title, String author, String ISBN, double price, int stock) {
        super(title, author, ISBN, price);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        reviews.add(review);
    }

    public double getAverageRating(){
        double avg=0;
        for (Review r:reviews){
            avg=avg+r.getRating();
        }
        avg=avg/reviews.size();
        return avg;
    }

    public void purchase (User user){
        user.addToCart(this);
    }

    public boolean isBestSeller(){
        return getAverageRating() > 4.5;
    }

    public void restock(int quantity){
        if (quantity>0){stock = stock+quantity;
        System.out.println("The restock is completed");}
        else System.out.println("There was a problem");
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()>4.5) return "Bestselling Book";
        else return "Book";
    }

    @Override
    public String toString() {
        return super.toString()+"\nStock: "+stock+"\nReviews: "+reviews.toString();
    }
}
