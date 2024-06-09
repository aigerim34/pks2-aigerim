import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес на Земле в кг: ");
        double earthWeight = scanner.nextDouble();
        double moonWeightFactor = 0.165;
        double annualIncreaseRate = 1.032;

        for (int year = 1; year <= 15; year++) {
            double moonWeight = earthWeight * moonWeightFactor;
            System.out.printf("%d год: %.2f кг\n", year, moonWeight);
            earthWeight *= annualIncreaseRate;
        }
        scanner.close();
    }
}

