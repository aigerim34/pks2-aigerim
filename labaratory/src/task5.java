public class task5 {
    public static void main(String[] args) {
        String[] transactions = {
                "Пополнение через банкомат ~ +1000",
                "Оплата интернета ~ -500",
                "Кафе ~ -300",
                "Зарплата ~ +15000",
                "Штраф за парковку ~ -2500",
                "Подарок ~ +2000"
        };

        int totalBalance = 0;

        for (String transaction : transactions) {
            String[] parts = transaction.split(" ~ ");
            int amount = Integer.parseInt(parts[1]);
            totalBalance += amount;
        }

        System.out.printf("Итоговая сумма на счету составляет %d\n", totalBalance);
    }
}
