import java.util.Scanner;

public class ejercicios3 { 
    public static void main(String[] args) {
        int fahrenheit = 350;
        double celsius = 0.0;
        double conversion = 0.0;

        Scanner horno = new Scanner(System.in);
        conversion = (fahrenheit - 32)/ 1.8;

        celsius = conversion;

        System.out.println("La Temperatura que tiene en ºC es: " + celsius);
        horno.close();

    }
}
