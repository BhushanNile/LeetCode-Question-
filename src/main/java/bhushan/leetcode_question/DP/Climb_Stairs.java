package bhushan.leetcode_question.DP;

import java.util.Arrays;

public class Climb_Stairs {
    class Solution {
        // Declare the memoization array globally within the Solution class
        // It will store the calculated number of ways for each 'n'
        private int[] memo;


        private int stairs(int n) {
            // Base Case 1: If n is 0, there's 0 ways to climb (or 1 way if you consider starting at 0 as 1 way,
            // but for this problem, we're climbing *to* n, so 0 stairs means 0 ways to climb further).
            // This also handles cases where n-2 might become 0 or negative.
            if (n <= 0) {
                return 0;
            }
            // Base Case 2: If there's 1 stair, there's only 1 way to climb it (take 1 step).
            if (n == 1) {
                return 1;
            }
            // Base Case 3: If there are 2 stairs, there are 2 ways to climb them:
            // (1 + 1 steps) or (2 steps).
            if (n == 2) {
                return 2;
            }

            // Memoization Check: If the result for 'n' has already been computed and stored,
            // return it directly to avoid redundant calculations.
            if (memo[n] != -1) {
                return memo[n];
            }

            // Recursive Step: For n > 2, the number of ways to climb 'n' stairs is the sum of:
            // 1. Ways to climb (n-1) stairs (if you take 1 step from the current position).
            // 2. Ways to climb (n-2) stairs (if you take 2 steps from the current position).
            int waysFromNMinus1 = stairs(n - 1);
            int waysFromNMinus2 = stairs(n - 2);

            // Store the computed result in the memoization array before returning.
            // This ensures that if 'n' is encountered again, we can retrieve the result instantly.
            memo[n] = waysFromNMinus1 + waysFromNMinus2;
            return memo[n];
        }

        /**
         * Main method to calculate the number of ways to climb 'n' stairs.
         *
         * @param n The total number of stairs.
         * @return The number of distinct ways to climb 'n' stairs.
         */
        public int climbStairs(int n) {
            // Initialize the memoization array.
            // We need a size of 'n + 1' because we want to store results up to index 'n'.
            // For example, if n=5, we need indices 0, 1, 2, 3, 4, 5. So, size 6.
            memo = new int[n + 1];

            // Fill the memoization array with -1 to indicate that results are not yet computed.
            // -1 is a common sentinel value for uncomputed results.
            Arrays.fill(memo, -1);

            // Start the recursive calculation from 'n'.
            return stairs(n);
        }
    }

}
