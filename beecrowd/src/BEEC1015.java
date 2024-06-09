import java.util.Locale;
import java.util.Scanner;

public class BEEC1015 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distanciaX = Math.pow((x2-x1), 2);
        double distanciaY = Math.pow((y2-y1), 2);
        double distancia = Math.sqrt((distanciaX + distanciaY));


        System.out.println(String.format("%.4f" , distancia));

        sc.close();

    }
}