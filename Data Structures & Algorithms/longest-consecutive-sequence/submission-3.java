class Solution {
    public int longestConsecutive(int[] nums) {
        // Map<Integer, Boolean> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
            // map.put(n, !map.containsKey(n-1));
        }
        return set.stream()
            .filter(it -> !set.contains(it-1))
            .map(it -> {
                int len = 0;
                int current = it;
                while(set.contains(current)) {
                    len++;
                    current++;
                }
                return len;
            })
            .max(Comparator.comparing(it -> it))
            .orElse(0);


        // return map.entrySet()
        //     .stream()
        //     .filter(it -> it.getValue() == true)
        //     .map(it -> it.getKey())
        //     .map(it -> {
        //         int len = 0;
        //         int current = it;
        //         while(map.containsKey(current)) {
        //             if (map.containsKey(current)) {
        //                 len++;
        //                 current++;
        //             }
        //         }
        //         return len;
        //     })
        //     .max(Comparator.comparing(it -> it))
        //     .orElse(0);
    }
}
