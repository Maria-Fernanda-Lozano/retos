import java.util.Scanner;

public class ejercicios4 {
    public static void main(String[] args) {
        double vacunas = 0;
        int peso_del_bebe = 0;
        int meses_del_bebe = 0;

        Scanner dosis = new Scanner(System.in);
        System.out.println("digite el peso del bebe : ");
        peso_del_bebe = dosis.nextInt();

        System.out.println("digite los meses del bebe: ");
        meses_del_bebe = dosis.nextInt();

        vacunas = ((peso_del_bebe + 10) / (meses_del_bebe * 10)) * 8;

        System.out.println("La dosis correcta para el Bebe es de " +vacunas);
        dosis.close();
    }
}
