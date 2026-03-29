package hw.ch03;

public abstract class AbstractDisplay {
    private static final int DEFAULT_REPEAT_COUNT = 5;
    private final int repeatCount;

    public AbstractDisplay() {
        this(DEFAULT_REPEAT_COUNT);
    }

    public AbstractDisplay(int repeatCount) {
        this.repeatCount = repeatCount;
    }

    public abstract void open();
    public abstract void print();
    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < repeatCount; i++) {
            print();
        }
        close();
    }
}
