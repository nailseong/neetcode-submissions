class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            int i = map.getOrDefault(n, 0);
            map.put(n, ++i);
        }
        return map.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .mapToInt(it -> it.getKey())
            .limit(k)
            .toArray();
    }
}
