import java.util.ArrayList;

public class Store {

    private ArrayList<User> users=new ArrayList<>();
    private ArrayList<Media> media=new ArrayList<>();

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<Media> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Media> media) {
        this.media = media;
    }

    public void addUser(User user){
        users.add(user);
    }

    public ArrayList<User> displayUsers(){
        return users;
    }

    public void addMedia(Media media){
        this.media.add(media);
    }

    public ArrayList<Media> displayMedias(){
        return media;
    }

    public Book searchBook(String title){
        return (Book) media.stream().filter(media -> media instanceof Book && media.getTitle().equalsIgnoreCase(title)).findFirst().orElse(null);
    }

}
