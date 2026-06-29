class Solution {

    private static String DELIMITER = "#";

    // ["Hello","World"] -> 5#hello6#world
    // ["Hello", "##", "World"] -> 5#hello2###6#world
    // 2### -> 2 -> #(구분자) -> "##"
    public String encode(List<String> strs) {
        return strs.stream()
            .map(it -> it.length() + DELIMITER + it)
            .collect(Collectors.joining());
    }

    public List<String> decode(String str) {        
        char[] chars = str.toCharArray();
        int index = 0;
        
        List<String> result = new ArrayList<>();
        while(index < chars.length) {
            int lenIndex = index;

            while(lenIndex < chars.length) {
                if (String.valueOf(chars[lenIndex]).equals(DELIMITER)) {
                    break;
                }
                lenIndex++;
            }

            var lenSb = new StringBuilder();
            for(int i = index; i < lenIndex; i++) {
                lenSb.append(chars[i]);
            }
            String lenStr = lenSb.toString();
            int len = Integer.valueOf(lenStr);

            index += lenStr.length() + 1;

            var sb = new StringBuilder();
            for(int i = index; i < index + len; i++) {
                sb.append(chars[i]);
            }
            result.add(sb.toString());
            index += len;
        }

        return result;
    }
}
