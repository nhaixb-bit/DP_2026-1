package practice.ch01;

public class Main{
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        System.out.println("Book name:" +book.getName());
    }

    //방법1: 책꽂이에 클라이언트가 직접 접근해서 책을 꺼내는 방식
    System.out.println(x: "Books in the shelf:");
    for (int i = 0; i < bookShelf.getLength(); i++) {
        System.out.println("- " + bookShelf.getBookFrom(i).getName());
    }

    //방법2: 책꽂이에 반복자(iterator)를 만들어서 책을 꺼내는 방식
    System.out.println(x: "Books in the shelf (using iterator):");
    Iterator<Book> it = bookShelf.iterator(); //책꽂이에서 반복자를 얻음
    while(it.hasNext()) {
        System.out.println("- " + it.next().getName()); //반복자에서 책을 꺼내서 이름을 출력
    }

    //방법3: 책꽂이에 반복자(iterator)를 만들어서 책을 꺼내는 방식(for-each 문)
    //형식: for (타입 변수 : 컬렉션) { ... }
    for (Book b : bookshelf) { //Iterable 인터페이스를 구현했기 때문에 }
}