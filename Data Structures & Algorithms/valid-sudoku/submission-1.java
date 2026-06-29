class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            Set<Character> charA = new HashSet<>();
            Set<Character> charB = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                char a = board[i][j];
                if (a != '.') {
                    if (charA.contains(a)) {
                        return false;
                    }
                    charA.add(a);
                }

                char b = board[j][i];
                if (b != '.') {
                    if (charB.contains(b)) {
                        return false;
                    }
                    charB.add(b);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            int index = i * 3;
            for (int d = 0; d < 3; d++) {
                int dindex = d * 3;
            
            Set<Character> set = new HashSet<>();
            for(int j = 0 + index; j < 3 + index; j++) {
                for(int k = 0 + dindex; k < 3 + dindex; k++) {
                    char c = board[j][k];
                    if (c != '.') {
                        if (set.contains(c)) {
                            return false;
                        }
                        set.add(c);
                    }
                }
            }
            }
        }
        return true;
    }
}
