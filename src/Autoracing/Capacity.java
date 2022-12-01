package Autoracing;

public enum Capacity {
    XS(0,10),
    S(10,25),
    M(40,50),
    L(60,80),
    XL(100,120);

    private int from;
    private int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}
