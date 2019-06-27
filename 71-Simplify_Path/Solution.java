import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        Deque<String> deque = new LinkedList<>();
        int N = path.length() - 1;

        int head = 0;
        for(int tail = 1; tail <= N; tail++) {
            String subStr = null;
            if(tail == N)
                subStr = path.substring(head+1, tail + 1);
            else if(path.charAt(tail) == '/')
                subStr = path.substring(head+1, tail);
            if(subStr!=null && !subStr.isEmpty()) {
                switch(subStr) {
                    case "..":
                        if(!deque.isEmpty())
                            deque.pollLast();
                        break;
                    case ".":
                        break;
                    default:
                        deque.offerLast(subStr);
                        break;
                }
                head = tail;
            }
        }

        if(deque.isEmpty())
            return "/";

        StringBuilder sb = new StringBuilder();
        while(!deque.isEmpty()) {
            sb.append('/').append(deque.pollFirst());
        }

        return sb.toString();
    }
}