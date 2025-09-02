package mx.edu.utez;

public class Division {
    private double num;
    private double num2;

    public double calculaDivision(double num, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir entre 0");
        }
        return num / num2;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
