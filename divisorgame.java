public class divisorgame{
    public static boolean divisorGame(int n) {
        int count = 0;
        while (n > 0) {
            boolean divisorFound = false;
            for (int x = 1; x < n; x++) {
                if (n % x == 0) {
                    n -= x;
                    divisorFound = true;
                    break;
                }
            }
            if (!divisorFound) {
                break;
            }
            count++;
        }
        return count % 2 != 0;
    }
}

