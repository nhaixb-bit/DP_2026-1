package hw.ch03;

public class CharDisplay extends AbstractDisplay {
    private final char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    public CharDisplay(char ch, int repeatCount) {
        super(repeatCount);
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
