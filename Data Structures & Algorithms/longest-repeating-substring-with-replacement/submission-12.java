class Solution {
    public int characterReplacement(String s, int k) {
        int[] counter = new int[26];
        int l = 0, freq = 0, len = 0;
        
        for (int r = 0; r < s.length(); r++) { // O(n)
            freq = Math.max(freq, ++counter[s.charAt(r) - 'A']);

            while (r - l + 1 - freq > k) { // window 조정
                counter[s.charAt(l++) - 'A']--;
            }

            len = Math.max(len, r - l + 1);
        }

        return len;
    }
}
