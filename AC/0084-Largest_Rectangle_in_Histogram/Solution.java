class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> monoStack = new LinkedList<>();
        monoStack.addFirst(-1);
        int res = 0;
        
        for (int i = 0; i < heights.length; i++) {
            while (monoStack.size() > 1 && heights[monoStack.getFirst()] >= heights[i]) {
                int h = heights[monoStack.removeFirst()];
                int w = i - monoStack.getFirst() - 1;
                res = Math.max(res, h * w);
            }
            monoStack.addFirst(i);
        }
        while (monoStack.size() > 1) {
            int h = heights[monoStack.removeFirst()];
            int w = heights.length - monoStack.getFirst() - 1;
            res = Math.max(res, h * w);
        }
        
        return res;
    }
}