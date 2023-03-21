import java.util.Scanner;
public class reto1{
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        int cantidad;
        int suma=0;
        System.out.println("cuantas notas desea ingresar");
        cantidad=lectura.nextInt(); 
     int[]calificacion=new int [cantidad];
     for (int i=0;i<cantidad;i++){
        System.out.println("ingrese la nota");
        calificacion[i]=lectura.nextInt();
        suma=suma+calificacion[i];
     }
     float promedio=suma/calificacion.length; 
     System.out.println("la calificacion del estudiante es:"+promedio);

     if (promedio<3){
        System.out.println("el estudiante reprobo");
        
     } else if (promedio>3.0 && promedio<4.0){
        System.out.println("el estudiante paso raspando");
    } else if (promedio>4.0){
        System.out.println("el estudiante paso con buena calificacion");     
     }

lectura.close();
         }
          }
