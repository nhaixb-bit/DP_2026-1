package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreIterator implements Iterator<Book> {

    private BookShelf bookShelf;
    private String genre;
    private int index;

    public GenreIterator(BookShelf bookShelf, String genre) {
        this.bookShelf = bookShelf;
        this.genre = genre;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {

        while (index < bookShelf.getLength()) {

            Book book = bookShelf.getBookAt(index);

            if (book.getGenre().equals(genre)) {
                return true;
            }

            index++;
        }

        return false;
    }

    @Override
    public Book next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Book book = bookShelf.getBookAt(index);
        index++;

        return book;
    }
}