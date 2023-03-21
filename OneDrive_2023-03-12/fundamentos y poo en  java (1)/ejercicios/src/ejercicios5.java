import java.util.Scanner;
public class ejercicios5 { 
    public static void main(String[] args) {
        int num;
        double oper=0;

        Scanner numero = new Scanner(System.in);
    System.out.println("digite un numero");
    num=numero.nextInt();
    oper=num % 2;
    if(oper==0){ 
        System.out.println("el numero es par");
        if(num>10){ 
            System.out.println("el numero es mayor a 10");
        } else
        System.out.println("el numero es menor a 10");
    }
    }else if{ 
        System.out.println("el numero es impar");
    }
}
numeroclose
