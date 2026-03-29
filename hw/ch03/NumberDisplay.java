package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private final int number;

    public NumberDisplay(int number) {
        this.number = number;
    }

    public NumberDisplay(int number, int repeatCount) {
        super(repeatCount);
        this.number = number;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(number);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
}

