import java.util.Locale;
import java.util.Scanner;

public class BEEC1017 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        int horas = sc.nextInt();
        int velocidade = sc.nextInt();
        int consumo = 12;
        double litros = ((double)velocidade/consumo)*horas;

        System.out.println(String.format("%.3f", litros));

        sc.close();

    }
}