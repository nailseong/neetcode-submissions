class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : s.toCharArray()) { // O(n)
            int count = map.getOrDefault(c, 0);
            map.put(c, ++count);
        }

        for (char c : t.toCharArray()) { // O(n)
            if (!map.containsKey(c)) {
                return false;
            }
            int count = map.get(c);
            if (count == 1) {
                map.remove(c);
                continue;
            }
            map.put(c, --count);
        }

        return map.isEmpty();
    }
}
