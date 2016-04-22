import Iterator.domain.Book;
import Iterator.iIterator;
import Iterator.impl.BookShelf;

public class Main {

  public static void main(String[] args) {

    System.out.println("Main Started!!");
    System.out.println();

    BookShelf bookShelf = new BookShelf(4);

    bookShelf.appendBook(new Book("Around the World in 80 Days"));
    bookShelf.appendBook(new Book("Bible"));
    bookShelf.appendBook(new Book("Cinderella"));
    bookShelf.appendBook(new Book("Daddy-Long-Legs"));

    iIterator it = bookShelf.iterator();

    while (it.hasNext()) {
      Book book = (Book) it.next();
      System.out.println(book.getName());
    }

  }
}
