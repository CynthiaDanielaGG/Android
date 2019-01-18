package dgg.cynthia.com.navegacion;


public class Operaciones {
    Double num1;
    Double num2;

    public Operaciones(){}

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum1() {
        return num1;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getNum2() {
        return num2;
    }

    public Double suma(){
        return num1 + num2;
    }
    public Double resta(){
        return num1 - num2;
    }
    public Double multiplicacion(){
        return  num1 * num2;
    }
    public Double division(){
        return num1/num2;
    }

    @Override
    public String toString() {
        return "Operaciones{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
