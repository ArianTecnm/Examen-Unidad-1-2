package examen1.pkg2;

import java.util.Scanner;

public class Examen12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                Scanner scanner1 = new Scanner(System.in);
                        Scanner scanner2 = new Scanner(System.in);
        //En una rienda de musica se requiere sacar el porsentaje ganancia de 3 instrumentos 

        System.out.println("Instrumento...");

        System.out.print("Nombre del Intrumento 1: ");
        String Instrumento1 = scanner.nextLine();
        System.out.print("Precio Venta del Intrumento 1: ");
        double INS1 = scanner.nextDouble();
        System.out.print("Precio Compra del Intrumento 1: ");
        double INS11 = scanner.nextDouble();

        System.out.print("Nombre del Intrumento 2: ");
        String Instrumento2= scanner1.nextLine();
        System.out.print("Precio Venta del Intrumento 2: ");
        double INS2 = scanner1.nextDouble();
        System.out.print("Precio Compra del Intrumento 2: ");
        double INS22 = scanner1.nextDouble();

        System.out.print("Nombre del Instrumento 3: ");
        String Instrumento3 = scanner2.nextLine();
        System.out.print("Precio Venta del Intrumento 3: ");
        double INS3 = scanner2.nextDouble();
        System.out.print("Precio Compra del Intrumento 1: ");
        double INS33 = scanner2.nextDouble();
        
        int Venta1;
        Venta1 = (int) (INS1);
        int Compra1 = (int) (INS11);
        int Ganancia1;
        Ganancia1 = Venta1 - Compra1;
        int Total;
        Total = (Ganancia1 / Compra1) * 100;

        int Venta2;
        Venta2 = (int) (INS2);
        int Compra2 = (int) (INS22);
        int Ganancia2;
        Ganancia2 = Venta2 - Compra2;
        int Total2;
        Total2 = (Ganancia2 / Compra2) * 100;
        
        int Venta3;
        Venta3 = (int) (INS3);
        int Compra3 = (int) (INS33);
        int Ganancia3;
        Ganancia3 = Venta3 - Compra3;
        int Total3;
        Total3 = (Ganancia2/Compra2)*100;
        
        System.out.println("**************************");
        System.out.println("El Porcentaje de Ganancia de Instrumento 1 es: " + Total);
        System.out.println("El Porcentaje de Ganancia de Instrumento 2 es: " + Total2);
        System.out.println("El Porcentaje de Ganancia de Instrumento 3 es: " + Total3);
        System.out.println("**************************");

    }

}
