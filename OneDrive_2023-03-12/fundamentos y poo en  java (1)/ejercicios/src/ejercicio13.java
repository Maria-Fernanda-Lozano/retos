
    import java.util.Scanner;
    public class ejercicio13 {
        public static void main(String[] args) {
                
            int respuesta;
    
            Scanner trivia_g = new Scanner(System.in);
    
            System.out.println("Bienvenidos a la Trivia Gamer!");
            System.out.println("Pregunta 1: ¿Como se llama el hermano de Mario?");
            System.out.println("Escoge la respuesta con el número: ");
            System.out.println("1)Luigi");
            System.out.println("2)Mario Jr.");
            System.out.println("3)Luis");
            System.out.println("4)Honguito");
    
            respuesta = trivia_g.nextInt();
    
            if (respuesta==1) {
    
                System.out.println("Respuesta correcta, siguiente pregunta");
            
            } 
            else {
    
                System.out.println("Respuesta incorrecta, Gracias por participar");
            }
            trivia_g.close();
            }
        } 
