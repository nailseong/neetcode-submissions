class Solution {
    public int characterReplacement(String s, int k) {
        int[] counter = new int[26];
        
        int l = 0, freq = 0, len = 0;
        char[] chars = s.toCharArray();
        for (int r = 0; r < s.length(); r++) {
            char c = chars[r];
            freq = Math.max(freq, ++counter[c-'A']);
            while (r - l + 1 - freq > k) { // window 조정
                char remove = chars[l++];
                counter[remove-'A']--;
            }
            len = Math.max(len, r - l + 1);
        }

        return len;
    }
}
