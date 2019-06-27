import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();

        String[] subStrs = path.split("/");

        for(String s : subStrs) {
            if(!s.isEmpty() && !s.equals(".")) {
                if(s.equals("..")){
                    deque.pollLast();
                } else {
                    deque.offerLast(s);
                }
            }
        }

        if(deque.isEmpty())
            return "/";

        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()) {
            sb.append('/').append(deque.removeFirst());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.simplifyPath("/.//../sd//./dsfs/../sfd////././.././/.."));
    }
}