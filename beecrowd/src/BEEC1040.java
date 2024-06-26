import java.util.Locale;
import java.util.Scanner;

public class BEEC1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float N1, N2, N3, N4, media, N5, mediaFinal;

        N1 = sc.nextFloat();
        N2 = sc.nextFloat();
        N3 = sc.nextFloat();
        N4 = sc.nextFloat();
        media = ((N1*2)+(N2*3)+(N3*4)+(N4*1))/10;

        if (media >=7.0) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno aprovado.");
        }
        else if (media < 5.0) {
            System.out.println("Media: " + String.format("%.1f", media));
            System.out.println("Aluno reprovado.");
        }
        else {
            System.out.println("Media: " +String.format("%.1f", media));
            System.out.println("Aluno em exame.");
            N5 = sc.nextFloat();
            System.out.println("Nota do exame: " +String.format("%.1f", N5));
            mediaFinal = (N5+media)/2;

            if (mediaFinal >=5.0) {
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f", mediaFinal));
            }
            else if (mediaFinal <=4.9) {
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + String.format("%.1f", mediaFinal));

            }
        }

        sc.close();

    }

}