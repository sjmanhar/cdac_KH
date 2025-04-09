class Day6Q1{
	static boolean isBalanced(String exp) {
        char[] stack = new char[exp.length()];
        int top = -1; // Stack pointer

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            }
            // Check closing brackets
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) return false; // No matching opening bracket

                char last = stack[top--]; // Pop from stack

                // Check if it matches with the last opened bracket
                if ((ch == ')' && last != '(') || 
                    (ch == '}' && last != '{') || 
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return (top == -1); // If stack is empty, it's balanced
    }

    public static void main(String[] args) {
        String exp1 = "[(])";
        System.out.println(exp1 + " -> " + (isBalanced(exp1) ? "Balanced" : "Not Balanced"));

        String exp2 = "[()]{}[{()}](){}";
        System.out.println(exp2 + " -> " + (isBalanced(exp2) ? "Balanced" : "Not Balanced"));
    }
}