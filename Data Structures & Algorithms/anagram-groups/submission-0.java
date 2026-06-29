class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> map = new HashMap<>();
        for (String s : strs) {
            List<Integer> key = convert(s);
            List<String> value = map.getOrDefault(key, new ArrayList<>());
            value.add(s);
            map.put(key, value);
        }
        return map.values().stream().toList();
    }

    public List<Integer> convert(String s) {
        List<Integer> a = new ArrayList<>(Collections.nCopies(26, 0));
        for (char c : s.toCharArray()) {
            int index = c - 'a';
            a.set(index, a.get(index) + 1);
        }
        return a;
    }
}
