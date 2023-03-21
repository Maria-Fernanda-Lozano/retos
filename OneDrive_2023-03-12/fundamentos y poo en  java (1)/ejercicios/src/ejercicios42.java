import java.util.Scanner;

public class ejercicios42 {
    public static void main(String[] args) {
        
        int meses;
    

        Scanner signos1 = new Scanner(System.in);

        for (int i =1; i <13; i++){ 
         
        int[] signos={1,2,3,4,5,6,7,8,9,10,11,12};


        int mes []=new int[signos[i]];

        System.out.println("Ingrese su mes de nacimiento: ");
        System.out.println("1= Enero 2= Febrero 3= Marzo 4= Abril 5= Mayo 6= Junio 7= Julio 8= Agosto 9= Septiembre 10= Octubre 11= Noviembre 12= Diciembre");
        mes = signos1.nextInt(13);
        System.out.println("Elegiste " + mes);

        switch (meses) {
            case 1: {

                System.out.println("Eres Acuario");
                
                break;
            }
            case 2: {

                System.out.println("Eres Piscis");
                
                break;
            }
            case 3: {

                System.out.println("Eres Aries");
                
                break;
            }
            case 4: {

                System.out.println("Eres Tauro");
                
                break;
            }
            case 5: {

                System.out.println("Eres Geminis");
                
                break;
            }
            case 6: {

                System.out.println("Eres Cancer");
                
                break;
            }
            case 7: {

                System.out.println("Eres Leo");
                
                break;
            }
            case 8: {

                System.out.println("Eres Virgo");
                
                break;
            }
            case 9: {

                System.out.println("Eres Libra");
                
                break;
            }
            case 10: {

                System.out.println("Eres Escorpion");
                
                break;
            }
            case 11: {

                System.out.println("Eres Sagitario");
                
                break;
            }
            case 12: {

                System.out.println("Eres Capricornio");
                
                break;
            }
            
            default: {

                System.out.println("el valor digitado no es valido, vuelva a intentar");
                break;
        }

        }
        signos1.close();

    }
} { 
}
 }
