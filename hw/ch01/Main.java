package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("20240812 방지안 Iterator 패턴 과제");
    
        BookShelf bookShelf = new BookShelf(10);

        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000));

        System.out.println("===== Iterator 패턴 테스트 ====="); 

        // 기존 Iterator 테스트
        Iterator<Book> it = bookShelf.iterator();
        System.out.println("Iterator로 전체 책 출력: ");
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        // 확장 for문 테스트
        System.out.println("확장 for문으로 전체 책 출력: ");
        for (Book book: bookShelf) {
            System.out.println(book.getName());
        }
        System.out.println();

        // 장르 필터 테스트
        System.out.println("소설 장르 책 목록: ");

        Iterator<Book> genreIt = bookShelf.iteratorByGenre("소설");

        while (genreIt.hasNext()) {
            Book book = genreIt.next();

            System.out.println(
                book.getName() + " | " +
                book.getGenre() + " | " +
                book.getYear() + " | " +
                book.getPrice()
            );
        }

        System.out.println();

        // 출판연도 역순 테스트
        System.out.println("출판연도 역순 책 목록");

        Iterator<Book> yearIt = bookShelf.iteratorByYear();

        while (yearIt.hasNext()) {
            Book book = yearIt.next();

            System.out.println(
                book.getName() + " | " +
                book.getGenre() + " | " +
                book.getYear() + " | " +
                book.getPrice()
            );
        }
    }
}