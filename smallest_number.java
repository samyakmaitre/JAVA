class Solution {
    public String smallestNumber(int s, int d) {
        // If the sum of the digits is greater than the maximum possible sum, return -1
        if (s > 9 * d) {
            return "-1";
        }
        
        // Array to store digits of the result number
        int[] result = new int[d];
        
        // Fill the array from the last digit to the first digit
        for (int i = d - 1; i >= 0; i--) {
            // If the remaining sum is greater than 9, set the current digit to 9
            if (s > 9) {
                result[i] = 9;
                s -= 9;
            } else {
                // Otherwise, set the current digit to the remaining sum and break the loop
                result[i] = s;
                s = 0;
                break;
            }
        }
        
        // If there's any sum left to be distributed, distribute it to the first digit
        if (s > 0) {
            result[0] += s;
        }
        
        // Convert the result array to a string
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            sb.append(digit);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        System.out.println(solution.smallestNumber(9, 2)); // Output: "18"
        System.out.println(solution.smallestNumber(20, 3)); // Output: "299"
        System.out.println(solution.smallestNumber(28, 3)); // Output: "-1"
    }
}
