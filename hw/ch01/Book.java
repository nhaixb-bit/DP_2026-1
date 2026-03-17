package hw.ch01;

public class Book {
    private String name;
    private String genre; //장르 데이터 추가
    private int year; //출판년도 데이터 추가
    private int price; //가격 데이터 추가

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String genre, int year, int price) { //생성자 추가
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}
