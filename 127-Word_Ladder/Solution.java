import java.util.*;

class Node {
    final String word;
    final int step;
    Node(String w, int s) {
        word = w;
        step = s;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Node> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.offer(new Node(beginWord, 1));
        visited.add(beginWord);

        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for(String s : wordList) {
                if(!visited.contains(s) && isLinked(s, node.word)) {
                    if(s.equals(endWord))   return (node.step + 1);
                    queue.offer(new Node(s, node.step + 1));
                    visited.add(s);
                }
            }
        }

        return 0;
    }

    private static boolean isLinked(final String a, final String b) {
        if(a.length() != b.length())    return false;
        int diff = 0;
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i))  diff++;
            if(diff > 1)    return false;
        }
        return diff == 1;
    }
}