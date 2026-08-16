class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> cw = new HashMap<>();
        HashMap<String, Character> wc = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = words[i];

            if (cw.containsKey(c)) {
                if (!cw.get(c).equals(str)) {
                    return false;
                }
            } else {
                cw.put(c, str);
            }

            if (wc.containsKey(str)) {
                if (wc.get(str) != c) {
                    return false;
                }
            } else {
                wc.put(str, c);
            }
        }
        return true;
    }
}