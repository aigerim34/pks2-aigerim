import java.util.Locale;
import java.util.Scanner;

public class BEEC1036 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double delta = Math.pow(B, 2) - (4 * A * C);
        double R1 = (-B + Math.sqrt(delta))/(2*A);
        double R2 = (-B - Math.sqrt(delta))/(2*A);

        if (delta > 0 && A!=0){
            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));
        }
        else {
            System.out.println("Impossivel calcular");
        }




        sc.close();

    }

}
