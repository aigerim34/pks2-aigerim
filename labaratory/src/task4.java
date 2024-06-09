public class task4 {
    public static void main(String[] args) {
        int minutes = 60;
        int messages = 55;

        double baseCost = 15.00;
        double additionalMinuteCost = (minutes > 50) ? (minutes - 50) * 0.25 : 0;
        double additionalMessageCost = (messages > 50) ? (messages - 50) * 0.15 : 0;
        double emergencyServiceFee = 0.44;

        double subTotal = baseCost + additionalMinuteCost + additionalMessageCost + emergencyServiceFee;
        double tax = subTotal * 0.05;
        double totalCost = subTotal + tax;

        System.out.printf("Базовая стоимость: $%.2f\n", baseCost);
        if (additionalMinuteCost > 0) System.out.printf("Дополнительные минуты: $%.2f\n", additionalMinuteCost);
        if (additionalMessageCost > 0) System.out.printf("Дополнительные сообщения: $%.2f\n", additionalMessageCost);
        System.out.printf("Сбор за 911: $%.2f\n", emergencyServiceFee);
        System.out.printf("Налог: $%.2f\n", tax);
        System.out.printf("Итоговая сумма: $%.2f\n", totalCost);
    }
}
