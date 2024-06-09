import java.util.Locale;
import java.util.Scanner;

public class BEEC1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, perimetro, area;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        perimetro = A + B + C;
        area = (A+B)*C/2;

        if ((A < B + C) && (B < A + C) && (C < A + B)) {
            System.out.println("Perimetro = " + String.format("%.1f", perimetro));
        }
        else{
            System.out.println("Area = " + String.format("%.1f", area));
        }
        sc.close();

    }

}