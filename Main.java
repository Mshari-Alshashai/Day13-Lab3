import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mshari", "Mshari@example.com");

        Book book = new Book("Java Basics", "John", "1234567890", 15.99, 10);
        Novel novel = new Novel("Mystery in the Fog", "Smith", "2345678901", 9.99, 5, "Mystery");
        AcademicBook academicBook = new AcademicBook("Physics Fundamentals", "Dr. Brown", "3456789012", 29.99, 3, "Physics");
        Movie movie = new Movie("Epic Adventure", "Sam", "4567890123", 19.99, 130);

        Music music1 = new Music("Smooth Jazz", "Jazz Master","5678901234",7.99 );
        Music music2 = new Music("Rock", "Rock Master","1238901234",5.99 );
        Music music3 = new Music("Orchestra", "Orchestra Master","5672221234",9.99 );
        Music music4 = new Music("Rap", "Rap Master","3338901234",6.99 );
        Music music5 = new Music("Hard Jazz", "Jazz Master","5278901234",7.99 );


        ArrayList<Music> musicArrayList =new ArrayList<>();

        musicArrayList.add(music1);
        musicArrayList.add(music2);
        musicArrayList.add(music3);
        musicArrayList.add(music4);
        musicArrayList.add(music5);

        Store store = new Store();
        store.addMedia(book);
        store.addMedia(novel);
        store.addMedia(academicBook);
        store.addMedia(movie);
        store.addMedia(music1);

        store.addUser(user1);

        user1.addToCart(book);
        user1.addToCart(novel);

        music3.listen(user1);
        movie.watch(user1);

        user1.removeFromCart(book);

        book.addReview(new Review("Mshari", 1, "Bad book for beginners!"));

        book.restock(50);


        System.out.println(music1.generatePlaylist(musicArrayList));

        System.out.println("**************************************************");

        user1.checkOut();

        System.out.println("**************************************************");

        book.addReview(new Review("Mshari", 4, "Great book for beginners!"));
        System.out.println("Average Rating of Book: " + book.getAverageRating());
        
        System.out.println("**************************************************");
        System.out.println(store.displayMedias());
        System.out.println("**************************************************");

    }
}
