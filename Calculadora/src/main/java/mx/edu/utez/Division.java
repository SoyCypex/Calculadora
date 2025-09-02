package mx.edu.utez;

public class Division {
    private double numero;
    private double numero2;

    public double calculaDivision(double numero, double numero2) {
        if (numero2 == 0) {
            System.out.println("No se puede dividir entre 0");
        }
        return numero / numero2;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero){
        this.numero = numero;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
