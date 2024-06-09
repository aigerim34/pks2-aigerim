import java.util.Locale;
import java.util.Scanner;

public class BEEC1002 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double r = sc.nextDouble();
        double pi = 3.14159;
        double R = Math.pow(r, 2);
        double A = pi * R;

        System.out.printf("A=%.4f\n", A);

        sc.close();

    }
}
