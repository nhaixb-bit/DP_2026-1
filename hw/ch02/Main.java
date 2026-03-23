package hw.ch02;

public class Main {
    public static void main(String[] args) {

        System.out.println("20240812 방지안 2장 과제");

        KoreanOutlet outlet = new KoreanOutlet();
        Charger adapter = new KoreanOutletAdapter(outlet); //Adapter 패턴 적용

        Smartphone phone = new Smartphone(adapter); //스마트폰이 Charger 인터페이스에 의존하도록 변경
        phone.charge();
    }
}