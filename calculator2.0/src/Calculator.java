
public class Calculator {

    private double num1 = -999999;
    private double num2 = -999999;
    private String function = "";

    public Calculator(Number A, Number B) {
        this.num1 = A.getValue();
        this.num2 = B.getValue();
    }

    public Calculator(){}

    public double Add(double A, double B){
        return A + B;
    }

    public double Subtract(double A, double B){
        return A - B;
    }

    public double Multiply(double A, double B){
        return A * B;
    }

    public double Divide(double A, double B){
        return A / B;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
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
        String symbol = "";
        if(this.function.equals("Add"))
                    symbol = "+";
        if(this.function.equals("Subtract"))
            symbol = "-";
        if(this.function.equals("Multiply"))
            symbol = "x";
        if(this.function.equals("Divide"))
            symbol = "/";
        return this.num1 + " " + symbol + " " + this.num2 + " = ";
    }
}
