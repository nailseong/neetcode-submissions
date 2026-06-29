class Solution {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toLowerCase().toCharArray();

        int l = 0;
        int r = charArray.length - 1;
        while (l < r) {
            if (!Character.isLetterOrDigit(charArray[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(charArray[r])) {
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
