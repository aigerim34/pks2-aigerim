import java.util.Arrays;

public class task9 {
    public static void main(String[] args) {
        int[] hoursWorkedPerDay = {8, 8, 8, 0, 8, 8, 8, 8, 0, 0, 8, 8, 8, 8, 8, 0, 8, 8, 8, 0};

        int totalHours = 0;
        int totalDaysWorked = 0;

        for (int i = 0; i < hoursWorkedPerDay.length; i++) {
            totalHours += hoursWorkedPerDay[i];
            if (hoursWorkedPerDay[i] != 0) {
                totalDaysWorked++;
            }
        }

        System.out.println("Часы работы по неделям: ");
        for (int i = 0; i < hoursWorkedPerDay.length; i += 5) {
            int weekTotal = Arrays.stream(hoursWorkedPerDay, i, Math.min(i + 5, hoursWorkedPerDay.length)).sum();
            System.out.println((i / 5 + 1) + "- " + weekTotal);
        }

        double averageHoursPerDay = (double) totalHours / totalDaysWorked;
        System.out.println("Среднее количество часов в день (учитывая только рабочие дни): " + averageHoursPerDay);
    }
}

