import java.util.List;

public class task2 {
    public static void main(String[] args) {
        List<String> actions = List.of("Dislike", "Like", "Like", "Dislike", "Dislike");
        String finalState = getFinalState(actions);
        System.out.println(finalState);
    }

    public static String getFinalState(List<String> actions) {
        String state = "Nothing";

        for (String action : actions) {
            if (state.equals(action)) {
                state = "Nothing";
            } else {
                state = action;
            }
        }
        return state;
    }
}
