 
  import java.util.Scanner;
 public class ejercicio12 {
    public static void main(String[] args) {
    
        int respuesta;

        Scanner trivia_g = new Scanner(System.in);

        System.out.println("Pregunta 3: ¿Hitman es conocido también como...?");
        System.out.println("Escoge la respuesta con el número: ");
        System.out.println("1)Phantom");
        System.out.println("2)47");
        System.out.println("3)GhostReaper");
        System.out.println("4)ShadowBlood");

        respuesta = trivia_g.nextInt();

        if (respuesta==2) {

            System.out.println("Respuesta correcta, siguiente pregunta");
        
        } 
        else {

            System.out.println("Respuesta incorrecta, Gracias por participar");
        }
        trivia_g.close();
        }
    }