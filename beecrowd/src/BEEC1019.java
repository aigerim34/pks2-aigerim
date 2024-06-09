import java.util.Scanner;

public class BEEC1019 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();
        int horas;
        int minutos;
        int segundos;

        horas = N/3600;
        minutos = (N % 3600) / 60;
        segundos = (N % 3600) % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();

    }
}