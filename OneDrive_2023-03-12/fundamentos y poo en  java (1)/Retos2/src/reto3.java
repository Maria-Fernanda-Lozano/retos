import java.util.Scanner;
public class reto3{
    public static void main(String[] args) {
        Scanner lectura=new Scanner(System.in);
        String [][] teclas={{"ESC","F1","F2","F3","F4","F5","F6","F7","F8","F9","F10","F11","F12","INS","INP PNT","SUPR"},
        {"|","1","2","3","4","5","6","7","8","9","0","'","¿","eliminar","inicio"},
        {"TAB","Q","W","E","R","T","Y","U","I","O","P","¨¨","+","}","REPAG"},
        {"MAYUS","A","S","D","F","G","H","J","K","L","Ñ","{}","ENTER","AVPAG"," "},
        {"SHIFT","Z","X","C","V","B","N","M",",",".","-","PAUASA","FIN"," "," "},
        {"CTRL","FIN","WD","ALT","------ESPACIO-----","ALT GR","<>","<","V",">"," ","","","",""}};

for (int fila=0;fila<6;fila++){
    for (int columna=0;columna<15;columna++) {
        System.out.print(teclas[fila][columna]+"\t");
        { 
            System.out.println("");
        
    }
    lectura.close();
}

         }
          }
          }