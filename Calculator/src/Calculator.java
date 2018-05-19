public class Calculator {

    private int num1 = -999999;
    private int num2 = -999999;
    private String function = "";

    public Calculator(Number A, Number B) {
        this.num1 = A.getValue();
        this.num2 = B.getValue();
    }

    public Calculator(){}

    public int Add(int A, int B){
        return A + B;
    }

    public int Subtract(int A, int B){
        return A - B;
    }

    public int Multiply(int A, int B){
        return A * B;
    }

    public int Divide(int A, int B){
        return A / B;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return this.num1 + function + this.num2 + " = ";
    }
}
