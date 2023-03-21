import java.util.Scanner;
public class ejercicio44 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String producto;
        double valor, TOTAL, total1;
        int Cantidad;
        
        System.out.println("BIENVENIO A LA TIENA DE COMESTIBLES");
        System.out.println("digite el producto que desea comprar: ");
        Cantidad=teclado.nextInt();

        do {
            System.out.println("nombre del producto que va a comprar: ");
            producto=teclado.next();
            System.out.println("Escriba el precio del producto: ");
            valor=teclado.nextDouble();

            System.out.println("Producto: "+producto);
            System.out.println("precio producto: "+valor);
            TOTAL=valor;

            System.out.println("con cuanto va a pagr:");
            total1=teclado.nextDouble();

            if (total1==TOTAL){
                System.out.println("su compra se a realizado ");
            } else if (total1>TOTAL){
                TOTAL=total1-valor;
                System.out.println("Su cambio es: "+TOTAL);
            } else if (total1<TOTAL){
                TOTAL=total1-valor;
                System.out.println(" esta incompleto, Te falta :"+TOTAL);  
            }
        } while (Cantidad>=5);
        teclado.close();   
    }
}
