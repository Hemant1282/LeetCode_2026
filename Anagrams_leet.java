class isAnagram_leetx {
    public static boolean isAnagram(String s, String t) {
        int count[] = new int[256];
        int count2[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int value = (int) (s.charAt(i));
            count[value]++;
        }

        for (int j = 0; j < t.length(); j++) {
            int value = (int) (t.charAt(j));
            count2[value]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}
