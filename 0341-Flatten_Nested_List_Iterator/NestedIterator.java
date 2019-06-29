import java.util.*;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}

public class NestedIterator implements Iterator<Integer> {
    private Deque<ListIterator<NestedInteger>> stack;

    public NestedIterator(List<NestedInteger> nestedList) {
        stack = new LinkedList<>();
        if(nestedList != null){
            stack.addFirst(nestedList.listIterator());
        }
    }

    @Override
    public Integer next() {
        // 其实只要下面这句就能AC，但是实际应用中可能不会先调用hasNext()
        // return stack.getFirst().next().getInteger();
        while(!stack.isEmpty()) {
            ListIterator<NestedInteger> it  = stack.getFirst();
            if(it.hasNext()) {
                NestedInteger ni = it.next();
                if(ni.isInteger()){
                    return ni.getInteger();
                } else {
                    stack.addFirst(ni.getList().listIterator());
                }
            } else {
                stack.removeFirst();
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        while(!stack.isEmpty()) {
            ListIterator<NestedInteger> it  = stack.getFirst();
            if(it.hasNext()) {
                NestedInteger ni = it.next();
                if(ni.isInteger()){
                    it.previous();
                    return true;
                } else {
                    stack.addFirst(ni.getList().listIterator());
                }
            } else {
                stack.removeFirst();
            }
        }
        return false;
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */