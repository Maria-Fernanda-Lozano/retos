import java.util.Scanner;

public class reto3 {
    public static void main(String[] args) {
        Scanner Juego = new Scanner(System.in);
        Double Apuesta;
        System.out.println("-------------");
        System.out.println("cuanto desea apostar: ");
        Apuesta=Juego.nextDouble();
        System.out.println("desea 1=cara o 2=sello: ");
        int  juega=Juego.nextInt();
        int eleccion=(int)(Math.random()*2)+1; 
        switch (eleccion) {

            case 0:
            System.out.println("sello");
                break;
                case 1:;
                System.out.println("cara");
                 break;
        }
                 switch (juega) {
                    case 0:
                    System.out.println("sello");
                    break;
                    case 1:;
                    System.out.println("cara");
                        break;
                 }
                 if (juega==eleccion) {
                    System.out.println("en buena hora ganaste");
                    Apuesta=Apuesta + Apuesta;
                    System.out.println("a ganado"+Apuesta);
                     } else {
                        System.out.println("lo lamento has perdido");
                        Apuesta=Apuesta-Apuesta;
                        System.out.println("acabas de perder"+Apuesta);

                    
                 }
    
        
Juego.close();

 }
  } 

    

