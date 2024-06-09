import java.util.Locale;
import java.util.Scanner;

public class BEEC1010 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
         int code1 = sc.nextInt();
         int quantity1 = sc.nextInt();
         float price1 = sc.nextFloat();
         int code2 = sc.nextInt();
         int quantity2 = sc.nextInt();
         float price2 = sc.nextFloat();
         float total = (quantity1 * price1) + (quantity2 * price2);

         System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));

         sc.close();

    }
}
