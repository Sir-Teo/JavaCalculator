public class Number {
    private int value = 0;

    public Number(int V) {
        this.value = V;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  Integer.toString(this.value);
    }

}
