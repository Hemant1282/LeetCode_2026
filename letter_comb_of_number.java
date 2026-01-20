import java.util.*;
class letter_comb_of_number {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.length() == 0)
            return result;

        String[] map = {
                "", // 0
                "", // 1
                "abc", // 2
                "def", // 3
                "ghi", // 4
                "jkl", // 5
                "mno", // 6
                "pqrs", // 7
                "tuv", // 8
                "wxyz" // 9
        };

        backtrack(digits, 0, new StringBuilder(), result, map);
        return result;
    }

    private void backtrack(String digits, int index, StringBuilder sb,
            List<String> result, String[] map) {

        if (index == digits.length()) {
            result.add(sb.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {
            sb.append(c);
            backtrack(digits, index + 1, sb, result, map);
            sb.deleteCharAt(sb.length() - 1); // 🔥 correct use of deleteCharAt
        }
    }
}
