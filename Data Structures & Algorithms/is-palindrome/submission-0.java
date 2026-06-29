class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();

        int l = 0;
        int r = charArray.length - 1;
        while (l < r) {
            if (!String.valueOf(charArray[l]).matches("^[a-z0-9]$")) {
                l++;
                continue;
            }
            if (!String.valueOf(charArray[r]).matches("^[a-z0-9]$")) {
                r--;
                continue;
            }
            if (charArray[l] != charArray[r]) {
                return false;
            } 
            l++;
            r--;
        }
        return true;
    }
}
