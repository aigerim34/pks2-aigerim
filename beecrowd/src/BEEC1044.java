
import java.util.Scanner;

public class BEEC1044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, result;
        A = sc.nextInt();
        B = sc.nextInt();
        result = B/A;

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();

    }

}