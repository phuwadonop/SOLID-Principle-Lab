import java.util.List;

public class BookR extends Book{
    public BookR(String title, List<String> pages) {
        super(title, pages);
    }
    @Override
    public void print() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
