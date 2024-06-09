import java.util.Locale;
import java.util.Scanner;

public class BEEC1009 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();
        double bonus = sales * 0.15;
        double total = salary + bonus;

        System.out.println("TOTAL = R$ " + String.format("%.2f", total));

        sc.close();

    }
}
