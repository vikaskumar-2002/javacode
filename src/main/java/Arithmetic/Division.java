package Arithmetic;

public class Division {
    private int num1;
    private int num2;
    private int Divide;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getDivide() {
        return Divide;
    }

    public void setDivide(int divide) {
        Divide = divide;
    }
    public void divide(int a,int b){
        this.num1 = a;
        this.num2 = b;
        this.Divide = a/b;
        System.out.println(Divide);

    }
}
