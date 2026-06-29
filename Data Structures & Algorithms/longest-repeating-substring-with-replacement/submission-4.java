class Solution {
    public int characterReplacement(String s, int k) {
        Set<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            set.add(c);
        }

        int len = 0;
        for(char c : set) {
            int l = 0;
            int count = 0;

            for (int r = 0; r < s.length(); r++) {
                if (chars[r] == c) {
                    len = Math.max(len, r - l + 1);
                    continue;
                }

                while (count >= k && chars[l++] == c) { // 사이즈 줄이기
                }

                len = Math.max(len, r - l + 1);
                count++;
            }
        }

        return len;
    }
}
