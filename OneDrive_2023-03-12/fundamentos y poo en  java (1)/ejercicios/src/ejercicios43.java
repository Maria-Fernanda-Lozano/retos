import java.util.Scanner;

public class ejercicios43 {
    public static void main(String[] args)  {

    int elegir;
    int probabilidad = (int) Math.floor(Math.random() * (20 - 1 + 1) + 1 );

    Scanner juego = new Scanner(System.in);

    int [][] Buscaminas= {{1,5,9,13},{2,6,10,14,20},{3,7,11,15},{4,8,12,16,18}};

    System.out.println("BUSCAMINAS");
    
    for(int fila=0;fila<4;fila++) {

    for(int columna=0;columna<4;columna++)

    {

    System.out.print(Buscaminas[fila][columna]+"\t");

    }

    System.out.println("");

    }

    do {

    System.out.println("digite el numero con el que va a enpezar");
    elegir=juego.nextInt();

    if(elegir==probabilidad) {

    System.out.println("encontraste una mina,has perdido el juego");

    } else {

    System.out.println("vas bien, sigue el juego");

    }

    int i = 1;
    i = i + 1;
    
    } while (elegir!=probabilidad & elegir<=8); {

        System.out.println("Sigue el juego");

    }

    System.out.println("fin de el juego que has logrado");

    juego.close();
    }
}
