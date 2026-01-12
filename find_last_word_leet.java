public class find_last_word_leet {
    // public static int lengthOfLastWord(String s) {
    // int count = 0;
    // int recent_count = 0;
    // for(int i = 0;i<s.length();i++){
    // if(s.charAt(i) != ' '){
    // count++;
    // recent_count = count;
    // }
    // else{
    // count = 0;
    // }
    // }
    // if(s.charAt(s.length()-1) == ' '){
    // return recent_count;
    // }
    // else{
    // return count;
    // }

    // }
    public static int lengthOfLastWord(String s) {
        if (!s.contains(" ")) {
            return s.length();
        }
        String[] sArray = s.split(" ");
        return sArray[(sArray.length) - 1].length();
    }
}
