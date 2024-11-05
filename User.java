import java.util.ArrayList;

public class User {

    private String username;
    private String email;
    private ArrayList<Media> purchaseMediaList=new ArrayList<>();
    private ArrayList<Media> shoppingCart=new ArrayList<>();

    public User() {}

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchaseMediaList() {
        return purchaseMediaList;
    }

    public void setPurchaseMediaList(ArrayList<Media> purchaseMediaList) {
        this.purchaseMediaList = purchaseMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media media){
        shoppingCart.add(media);
    }

    public void removeFromCart(Media media){
        if (shoppingCart.contains(media))shoppingCart.remove(media);
    }

    public void checkOut(){
        for (Media media : shoppingCart) {
            if (media instanceof Book) {
                Book book = (Book) media;
                if (book.getStock() > 0) {
                    book.setStock(book.getStock() - 1);
                    purchaseMediaList.add(book);
                    System.out.println("Purchased: " + book.getTitle());
                } else {
                    System.out.println("Out of stock: " + book.getTitle());
                }
            } else if (media instanceof Movie) {
                purchaseMediaList.add(media);
                System.out.println("Purchased movie: " + media.getTitle());
            } else if (media instanceof Music) {
                purchaseMediaList.add(media);
                System.out.println("Purchased music: " + media.getTitle());
            }
        }
        shoppingCart.clear();
    }

}
