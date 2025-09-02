package mx.edu.utez;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

int opcion = sc.nextInt();

        switch (opcion) {
        case 1:
Suma suma = new Suma();

                System.out.print("Ingresa el primer número: ");
                suma.setNumero(sc.nextDouble());
        System.out.print("Ingresa el segundo número: ");
                suma.setNumero2(sc.nextDouble());

        System.out.println("Resultado: " + suma.calculaSuma(suma.getNumero(), suma.getNumero2()));
        break;

        case 2:
Restar resta = new Restar();

                System.out.print("Ingresa el primer número: ");
                resta.setNumero(sc.nextDouble());
        System.out.print("Ingresa el segundo número: ");
                resta.setNumero2(sc.nextDouble());

        System.out.println("Resultado: " + resta.calculaResta(resta.getNumero(), resta.getNumero2()));
        break;

        case 3:
            Multiplicacion multiplicacion = new Multiplicacion();

            System.out.print("Ingresa el primer número: ");
            multiplicacion.setNumero(sc.nextDouble());
            System.out.print("Ingresa el segundo número: ");
            multiplicacion.setNumero2(sc.nextDouble());

            System.out.println("Resultado: " + multiplicacion.calculaMultiplicacion(multiplicacion.getNumero(), multiplicacion.getNumero2()));
            break;

            case 4:
                Division division = new Division();

                System.out.print("Ingresa el primer número: ");
                division.setNumero(sc.nextDouble());
                System.out.print("Ingresa el segundo número: ");
                division.setNumero2(sc.nextDouble());

                System.out.println("Resultado: " + division.calculaDivision(division.getNumero(), division.getNumero2()));
                break;
                
        default:
        System.out.println("Opción no válida.");
        }

                sc.close();

        }
}