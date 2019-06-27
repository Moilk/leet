import java.util.*;

class Solution {
    static final Set<String> ops = new HashSet<>();

    static {
        ops.add("+");
        ops.add("-");
        ops.add("*");
        ops.add("/");
    }

    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new LinkedList<>();

        for(String token : tokens) {
            if(ops.contains(token)) {
                int b = stack.removeFirst();
                int a = stack.removeFirst();

                int res;
                switch(token) {
                    case "+":
                        res = a + b;
                        break;
                    case "-":
                        res = a - b;
                        break;
                    case "*":
                        res = a * b;
                        break;
                     default:
                        res = a / b;
                        break;
                }
                stack.addFirst(res);
            } else {
                stack.addFirst(Integer.parseInt(token));
            }
        }

        return stack.removeFirst();
    }
}