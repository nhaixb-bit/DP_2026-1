package hw.ch01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class YearIterator implements Iterator<Book> {

    private ArrayList<Book> sortedBooks;
    private int index = 0;

    public YearIterator(BookShelf bookShelf) {

        sortedBooks = new ArrayList<>(); //책들을 담을 ArrayList 생성

        for (int i = 0; i < bookShelf.getLength(); i++) {
            sortedBooks.add(bookShelf.getBookAt(i)); //BookShelf의 책들을 ArrayList에 복사
        }

        Collections.sort(sortedBooks, new Comparator<Book>() { //ArrayList 출판연도 기준으로 정렬
            @Override
            public int compare(Book b1, Book b2) { //최신출판 기준으로 정렬
                return b2.getYear() - b1.getYear();
            }
        });
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {

        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        return sortedBooks.get(index++);
    }
}