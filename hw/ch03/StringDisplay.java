package hw.ch03;

public class StringDisplay extends AbstractDisplay {
    private String string;  // 표시해야 하는 문자열
    private int width;      // 문자열의 길이

    // 기본 반복 횟수(5회)를 사용하는 생성자
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.length();
    }

    // 반복 횟수를 직접 지정하는 생성자
    public StringDisplay(String string, int repeatCount) {
        super(repeatCount);
        this.string = string;
        this.width = string.length();
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
