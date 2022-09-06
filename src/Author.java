/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

// Annotation to suppress warnings for unchecked methods
@SuppressWarnings("unchecked")

public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @Deprecated
    public List<String> getBooks() {
        return books;
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    // Pull methods sortName to Person and make it abstract
    @Override
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
