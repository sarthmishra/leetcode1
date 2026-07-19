class Solution {
    public String smallestSubsequence(String s) {
        int n = s.length();
        HashMap<Character, Integer> last = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            last.put(s.charAt(i), i);
        }

        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (set.contains(ch)) {
                continue;
            }

            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last.get(stack.peek()) > i) {

                set.remove(stack.pop());
            }

            stack.push(ch);
            set.add(ch);
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack) {
            ans.append(c);
        }

        return ans.toString();

    }
}