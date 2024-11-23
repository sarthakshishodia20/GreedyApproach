class Solution {
    // Hrr ek char ka pair bnao check krte jao stack ke peek element se 
    // agr k se choti hai value toh increment kro vrna pair  ko remove kro 
    // agr match nahi krta hai peek se toh seedha push kro 
    // hrr ek character ke liye unique pair nahi bnega jb tk ki adjacent characters available na ho vrna toh count mein add krte jao 
    // .valueOf gives you the character and .repeat usi character ko utne hi times repeat kr dega aapki string mein jitna uska count stored hai inside the pair for respective pair of character and count
    
    static class Pair {
        char ch;
        int count;
        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && stack.peek().ch == ch) {
                stack.peek().count++;
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                stack.push(new Pair(ch, 1));
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair pair = stack.pop();
            result.append(String.valueOf(pair.ch).repeat(pair.count));
        }
        return result.reverse().toString();
    }
}
