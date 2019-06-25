import java.util.*;

class Solution {
    static final Map<Character, Character> map = new HashMap<>();

    static {
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)) {
                stack.addFirst(c);
            } else if(stack.isEmpty() || map.get(stack.removeFirst()) != c){
                return false;
            }
        }

        return stack.isEmpty();
    }
}