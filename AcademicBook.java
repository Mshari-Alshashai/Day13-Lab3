import java.util.List;

public class AcademicBook extends Book{

    private String subject;

    public AcademicBook() {}

    public AcademicBook(String subject) {
        this.subject = subject;
    }

    public AcademicBook(int stock, String subject) {
        super(stock);
        this.subject = subject;
    }

    public AcademicBook(String title, String author, String ISBN, double price, int stock, String subject) {
        super(title, author, ISBN, price, stock);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()>4.5) return "Bestselling AcademicBook";
        else return "AcademicBook";
    }

    @Override
    public String toString() {
        return super.toString()+"\nSubject: "+subject;
    }
}
