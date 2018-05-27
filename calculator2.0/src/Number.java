public class Number {
    private double value = 0;
    public Number(double V) {
        this.value = V;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return  Double.toString(this.value);
    }

}
