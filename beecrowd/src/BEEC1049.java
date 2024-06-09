import java.util.Scanner;

public class BEEC1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n1, n2, n3;
        n1 = sc.nextLine();
        n2 = sc.nextLine();
        n3 = sc.nextLine();

        if (n1.equalsIgnoreCase("vertebrado")) {
            if (n2.equalsIgnoreCase("ave")) {
                if (n3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            }
        }
        if (n1.equalsIgnoreCase("vertebrado")) {
            if (n2.equalsIgnoreCase("mamifero")) {
                if (n3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        }
        if (n1.equalsIgnoreCase("invertebrado")) {
            if (n2.equalsIgnoreCase("inseto")) {
                if (n3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            }
        }
        if (n1.equalsIgnoreCase("invertebrado")) {
            if (n2.equalsIgnoreCase("anelideo")) {
                if (n3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }

        sc.close();
    }
}
