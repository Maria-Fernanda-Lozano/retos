import java.util.Scanner;

public class reto1 { 
    public static void main(String[] args) {
        int grados = 350;
        double kelvin = 0.0, cantidad = 0;
        double conversion = 0.0;
        int harina = 13;

        Scanner horno = new Scanner(System.in);
        conversion = (grados + 273.15);

        kelvin = conversion;

        System.out.println("La Temperatura que tiene en kelvin es: " + kelvin);

        cantidad=(harina * 10);

        System.out.println("la cantidad de harina que necesita para la torta es:"+cantidad);
        
        horno.close();

    }
}
