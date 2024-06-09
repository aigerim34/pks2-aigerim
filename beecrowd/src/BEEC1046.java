import java.util.Scanner;

public class BEEC1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;
        inicio = sc.nextInt();
        fim = sc.nextInt();

        if ( inicio >= fim) {
            duracao = (24 + fim) - inicio;
        }
        else {
            duracao = fim - inicio;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
