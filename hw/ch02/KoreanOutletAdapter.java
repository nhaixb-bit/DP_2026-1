package hw.ch02;

public class KoreanOutletAdapter implements Charger {

    private KoreanOutlet outlet; //기존 KoreanOutlet 클래스에 대한 참조 -> 기능 재사용

    public KoreanOutletAdapter(KoreanOutlet outlet) { //외부에서 KoreanOutlet 객체를 받아서 초기화 -> 유연성 증가
        this.outlet = outlet;
    }

    @Override
    public int charge() { //Charger 인터페이스의 charge() 메서드를 구현 -> 기존 KoreanOutlet의 provide() 메서드 호출
        return outlet.provide();
    }
}