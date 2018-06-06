/*
Bottom-up approach for finding values based on smallest values
 */

public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String str1 = "madam_racar_madam";
        String str2 = "madam_racr_mada";

        longestPalindrome(str1);
        longestPalindrome(str2);
    }

    private static void longestPalindrome(String str) {
        int n = str.length();
        boolean[][] table = new boolean[n][n];

        // Initialising for only 1 character
        int maxSize = 1;
        int start = 0;
        for(int i=0; i<n; i++) {
            table[i][i] = true;
        }

        // Initialising values for 2 characters
        for(int i=0; i<n-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                table[i][i+1] = true;
                maxSize = 2;
                start = i;
            }
        }

        // Initialising values for 3 and more characters
        // <= n because length started from 1 and not 0
        for(int k=3; k<=n;k++) {
            // Initialise start index
            for(int i=0; i<n-k+1; i++) {
                // Initialise ending index
                int j = i+k-1;

                // Check if (i+1, j-1)th value is true and if (i,j)th value is also true
                if(table[i+1][j-1] && str.charAt(i)==str.charAt(j)) {
                    table[i][j] = true;
                    maxSize = k;
                    start = i;
                }
            }
        }

        System.out.println("Biggest palindrome substring : " + str.substring(start, start + maxSize));
    }
}
