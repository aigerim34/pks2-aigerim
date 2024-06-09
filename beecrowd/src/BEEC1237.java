import java.util.Scanner;

public class BEEC1237{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            System.out.println(findLongestCommonSubstring(str1, str2));
        }

        scanner.close();
    }

    public static int findLongestCommonSubstring(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLength = Math.max(maxLength, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return maxLength;
    }
}
