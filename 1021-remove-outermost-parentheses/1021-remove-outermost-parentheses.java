class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> s1 = new Stack<>();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                if (!s1.isEmpty()) {
                    result += ch;
                }
                s1.push(ch);
            } else {
                if (!s1.isEmpty()) {
                    s1.pop();
                }
                if (!s1.isEmpty()) {
                    result += ch;
                }
            }
        }
        return result;
    }
}
