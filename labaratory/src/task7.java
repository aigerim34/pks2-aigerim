import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        scanner.close();

        for (int i = (age % 2 == 0) ? 0 : 1; i <= age; i += 2) {
            System.out.print(i + (i < age ? ", " : "\n"));
        }
    }
}

