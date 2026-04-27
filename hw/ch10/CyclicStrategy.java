package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int handvalue = 0;

    public CyclicStrategy() {
    }

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(handvalue);
        handvalue = (handvalue + 1) % 3;
        return hand;
    }

    @Override
    public void study(boolean win) {
        // study 호출해도 순환 순서에는 영향 없음
    }
}
