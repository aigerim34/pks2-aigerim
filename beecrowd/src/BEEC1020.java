import java.util.Scanner;

public class BEEC1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int anos;
        int meses;
        int dias;

        anos = N / 365;
        meses = (N % 365) / 30;
        dias = (N % 365) % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");

        sc.close();

    }

}