import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 2, 3, 3, 1);
        List<Integer> result = removeOddOccurrences(numbers);
        System.out.println(result);
    }

    public static List<Integer> removeOddOccurrences(List<Integer> numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int number : numbers) {
            countMap.put(number, countMap.getOrDefault(number, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();
        for (int number : numbers) {
            if (countMap.get(number) % 2 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}

