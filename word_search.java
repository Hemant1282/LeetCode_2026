class word_search {

        static final int[][] dirs = { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };

        private static boolean solve(int curr, int i, int j, char[][] board, String word) {
            // Base case: matched all characters
            if (curr == word.length() - 1)
                return true;

            // Explore all 4 directions
            for (int[] d : dirs) {
                int x = i + d[0];
                int y = j + d[1];

                // Check bounds
                if (x >= 0 && x < board.length && y >= 0 && y < board[0].length) {
                    // Check if next character matches
                    if (board[x][y] == word.charAt(curr + 1)) {
                        char temp = board[x][y];
                        board[x][y] = '#'; // Mark as visited in-place
                        boolean ans = solve(curr + 1, x, y, board, word);
                        board[x][y] = temp; // Backtrack: restore original
                        if (ans)
                            return true; // Early return on success
                    }
                }
            }
            return false;
        }
           
        public boolean exist(char[][] board, String word) {
            if (word.length() == 0)
                return false;

            // Optimization: Frequency check to prune impossible cases
            int[] freq = new int[128]; // ASCII table size
            for (char[] row : board) {
                for (char c : row) {
                    freq[c]++;
                }
            }
            for (char c : word.toCharArray()) {
                if (--freq[c] < 0) // Not enough of this character
                    return false;
            }

            // Try starting from each cell that matches first character
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[0].length; j++) {
                    if (board[i][j] == word.charAt(0)) {
                        char temp = board[i][j];
                        board[i][j] = '#'; // Mark starting cell
                        if (solve(0, i, j, board, word))
                            return true;
                        board[i][j] = temp; // Backtrack
                    }
                }
            }
            return false;
        }


        public static void main(String[] args) {
            
        }
}
