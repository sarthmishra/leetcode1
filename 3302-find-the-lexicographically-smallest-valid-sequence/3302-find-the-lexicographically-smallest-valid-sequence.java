class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        int[] lastPos = new int[m + 1];
        lastPos[m] = n;

        int ptr = n - 1;
        for (int j = m - 1; j >= 0; j--) {
            while (ptr >= 0 && word1.charAt(ptr) != word2.charAt(j)) {
                ptr--;
            }
            lastPos[j] = ptr;
            ptr--;
        }
        
        int[] result = new int[m];
        boolean usedChange = false;
        int i = 0, j = 0;
        
        while (i < n && j < m) {
            if (word1.charAt(i) == word2.charAt(j)) {
                result[j] = i;
                j++;
            } else {
                if (!usedChange && lastPos[j + 1] > i) {
            usedChange = true;
                    result[j] = i;
                    j++;
                }
            }
            i++;
        }
        
        return j == m ? result : new int[0];
    }
}