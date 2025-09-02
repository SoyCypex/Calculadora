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
}
