package hw.ch02;

public class Smartphone {

    private Charger charger; //인터페이스에 의존 -> 유연성 증가

    public Smartphone(Charger charger) {
        this.charger = charger;
    }

    public void charge() {
        int voltage = charger.charge();
        System.out.println("스마트폰이 " + voltage + "V 에서 충전합니다.");
    }
}