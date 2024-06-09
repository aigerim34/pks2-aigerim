import java.util.Locale;
import java.util.Scanner;

public class BEEC1011 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int r = sc.nextInt();
        double pi = 3.14159;
        double R = Math.pow(r, 3);
        double volume = ((4.0/3)*pi*R);

        System.out.println("VOLUME = " + String.format("%.3f", volume));

        sc.close();

    }
}
