import java.util.Scanner;
public class ejercicios1 { 
    public static void main(String[] args) {
        int ano_en_que_se_encuentra = 0;
        int ano_de_nacimiento = 0;
        int edad = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese año en el que se encuentra actual: ");
        ano_en_que_se_encuentra = lectura.nextInt();

        System.out.println("Ingrese su año de nacimiento: ");
        ano_de_nacimiento = lectura.nextInt();

        edad = ano_en_que_se_encuentra - ano_de_nacimiento;

        System.out.println("Tu papa " + edad + " años de edad");
        lectura.close();
    } 
}

public class Ejercicios1 {   
    public static void main(String[] args) {
        int ano_en_que_se_encuentra = 0;
        int ano_de_nacimiento = 0;
        int edad = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese año en el que se encuentra actual: ");
        ano_en_que_se_encuentra = lectura.nextInt();

        System.out.println("Ingrese su año de nacimiento: ");
        ano_de_nacimiento = lectura.nextInt();

        edad = ano_en_que_se_encuentra - ano_de_nacimiento;

        System.out.println("Tu mama " + edad + " años de edad");
        lectura.close();
    } 
}
    

