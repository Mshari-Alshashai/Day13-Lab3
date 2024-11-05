public class Main {
    public static void main(String[] args) {

        User user1 = new User("Mshari", "Mshari@example.com");

        Book book = new Book("Java Basics", "John", "1234567890", 15.99, 10);
        Novel novel = new Novel("Mystery in the Fog", "Smith", "2345678901", 9.99, 5, "Mystery");
        AcademicBook academicBook = new AcademicBook("Physics Fundamentals", "Dr. Brown", "3456789012", 29.99, 3, "Physics");
        Movie movie = new Movie("Epic Adventure", "Sam", "4567890123", 19.99, 130);
        Music music = new Music("Smooth Jazz", "Jazz Master","5678901234",7.99 );

        Store store = new Store();
        store.addMedia(book);
        store.addMedia(novel);
        store.addMedia(academicBook);
        store.addMedia(movie);
        store.addMedia(music);

        store.addUser(user1);

        user1.addToCart(book);
        user1.addToCart(movie);
        user1.addToCart(novel);

        user1.removeFromCart(book);

        user1.checkOut();

        System.out.println("**************************************************");

        book.addReview(new Review("Mshari", 4, "Great book for beginners!"));
        System.out.println("Average Rating of Book: " + book.getAverageRating());

        System.out.println("**************************************************");
        System.out.println(store.displayMedias());
        System.out.println("**************************************************");


//        System.out.println(book);
//        System.out.println(novel);
//        System.out.println(academicBook);
//        System.out.println(movie);
//        System.out.println(music);
    }
}
